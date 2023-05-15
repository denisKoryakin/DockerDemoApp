package ru.koryakin.firstdockerdemoapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstDockerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstDockerDemoApplication.class, args);
    }

    @Value("${app.name:undefined app}")
    private String appName;

    @Value("${inst.num:1}")
    private String instance;

    @GetMapping("/")
    public String sayHello() {
        return String.format("Hello from %s! instance: %s", appName, instance);
    }
}

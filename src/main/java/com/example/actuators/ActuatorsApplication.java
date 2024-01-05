package com.example.actuators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorsApplication {

    @Value("${info.app.version}")
    private static String appVersion;

    public static void main(String[] args) {
        SpringApplication.run(ActuatorsApplication.class, args);
        System.out.println(appVersion);
    }

}
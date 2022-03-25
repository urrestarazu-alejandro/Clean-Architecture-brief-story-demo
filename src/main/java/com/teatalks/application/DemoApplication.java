package com.teatalks.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Demo Application
 * Presentation Layer // Frameworks and Drivers Layer
 */
//@SpringBootApplication(scanBasePackages = {"com.teatalks.demo.layered.presentation"})
@SpringBootApplication(scanBasePackages = {"com.teatalks.clean.architecture.controllers"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

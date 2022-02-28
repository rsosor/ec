package com.rsosor.ec.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rsosor.ec")
public class EcSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcSearchApplication.class, args);
    }
}

package com.bodhiye.forceid.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bodhiye.forceid"})
public class ForceidRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForceidRestApplication.class, args);
    }
}

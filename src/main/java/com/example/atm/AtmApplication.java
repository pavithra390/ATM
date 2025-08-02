package com.example.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        System.out.println("***Application running successfully***");
        SpringApplication.run(AtmApplication.class, args);
    }

}

package com.ck.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PayckApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayckApplication.class, args);
    }

}


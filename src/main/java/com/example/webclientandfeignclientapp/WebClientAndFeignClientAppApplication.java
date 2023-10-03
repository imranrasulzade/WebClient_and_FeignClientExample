package com.example.webclientandfeignclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.webclientandfeignclientapp.client")
public class WebClientAndFeignClientAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientAndFeignClientAppApplication.class, args);
    }

}

package com.example.carbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CarBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarBookingApplication.class, args);
    }

}

package com.savitsky.airticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AirTicketBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirTicketBookingApplication.class, args);
    }

}

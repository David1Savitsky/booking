package com.savitsky.airticketbooking.controller;

import com.savitsky.airticketbooking.service.AirTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AirTicketController {

    private final AirTicketService airTicketService;

    @GetMapping("/test")
    public ResponseEntity<String> testEndPoint() {
        return ResponseEntity.ok().body(airTicketService.getTestString());
    }
}

package com.example.carbooking.controller;

import com.example.carbooking.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CarController {

    private final CarService carService;

    @GetMapping("/test")
    public ResponseEntity<Object> testEndPoint() {
        return ResponseEntity.ok().body(carService.getTestString());
    }
}

package com.example.webclientandfeignclientapp.controller;

import com.example.webclientandfeignclientapp.client.ReservationClient;
import com.example.webclientandfeignclientapp.model.ReservationDto;
import com.example.webclientandfeignclientapp.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;
    private final ReservationClient reservationClient;

    @GetMapping
    public List<ReservationDto> foo(){
        return testService.getReservations();
    }

    @GetMapping("/feign")
    public List<ReservationDto> foo2() {
        return reservationClient.getReservations();
    }

}

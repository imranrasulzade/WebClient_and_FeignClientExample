package com.example.webclientandfeignclientapp.client;

import com.example.webclientandfeignclientapp.model.ReservationDto;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(value = "reservation-service", url = "http://localhost:8080")
public interface ReservationClient {

    @GetMapping("/reservation")
    List<ReservationDto> getReservations();

    @PostMapping("reservation/add")
    ReservationDto addReservation(ReservationDto reservationDto);

}

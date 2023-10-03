package com.example.webclientandfeignclientapp.service;

import com.example.webclientandfeignclientapp.model.ReservationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final WebClient webClient;
    private FeignClient feignClient;
    public List<ReservationDto> getReservations(){
        List<ReservationDto> reservationDtos = webClient.get().uri("reservation").retrieve()
                .toEntityList(ReservationDto.class).block()
                .getBody();
        return reservationDtos;
    }




// FOR POST METHOD
//    public ReservationDto addReservation(ReservationDto reservationDto){
//        ReservationDto reservationDto1 = webClient.post()
//                .uri("/add/")
//                .header("Authorization", "Bearer MY_SECRET_TOKEN")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromValue(reservationDto))
//                .retrieve()
//                .bodyToMono(ReservationDto.class)
//                .block();
//        return reservationDto1;
//    }


}

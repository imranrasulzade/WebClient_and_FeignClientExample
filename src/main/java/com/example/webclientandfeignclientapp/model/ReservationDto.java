package com.example.webclientandfeignclientapp.model;

import lombok.Data;

@Data
public class ReservationDto {
    private Integer id;
    private String doctorFullName;
    private String patientFullName;
    private Integer day;
    private Integer month;
    private Integer hour;
    private Integer isAccepted;
    private Integer status;
}

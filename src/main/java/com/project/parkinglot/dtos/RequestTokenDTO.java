package com.project.parkinglot.dtos;


import com.project.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestTokenDTO {

    String VehicleNo;

    int gateId;

    String ownerName;

    VehicleType vehicleType;
}

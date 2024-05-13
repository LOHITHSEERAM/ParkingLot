package com.project.parkinglot.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vehicle extends BaseModel{

    @Enumerated(EnumType.STRING)
    VehicleType vehicleType;


    String vehicleNo;

    String owner_name;


}

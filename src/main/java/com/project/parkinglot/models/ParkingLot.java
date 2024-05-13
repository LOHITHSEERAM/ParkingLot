package com.project.parkinglot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class ParkingLot extends BaseModel{


    String parkingLotName;

    @OneToMany(mappedBy = "parkingLot")
    List<Floor> floors;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<VehicleType> vehicleTypes;

    @OneToMany(mappedBy = "parkingLot")
    List<Gate> gates;

    @Enumerated(EnumType.STRING)
    Status parkingLotStatus;


}

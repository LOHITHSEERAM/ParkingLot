package com.project.parkinglot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Floor extends BaseModel{

    int floorNo;

    @OneToMany(mappedBy = "floor")
    List<ParkingSlot> parkingSlots;

    @ManyToOne
    ParkingLot parkingLot;

     @Enumerated
     @ElementCollection
    List<VehicleType> vehicleTypes;

    @Enumerated(EnumType.ORDINAL)
    Status FloorStatus;
}

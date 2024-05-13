package com.project.parkinglot.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ParkingSlot extends BaseModel{

    int slotNo;

    @Enumerated(EnumType.ORDINAL)
    Status parkingSlotStatus;

    @Enumerated(EnumType.STRING)
    VehicleType vehicleType;

    @ManyToOne
    Floor floor;
}

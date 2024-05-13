package com.project.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity(name="parking_token")
public class ParkingToken extends BaseModel{

    LocalDateTime entryTime;

    String TokenNo;

    @OneToOne
    Vehicle vehicle;

    @OneToOne
    ParkingSlot assignedParkingSlot;

    @ManyToOne
    Gate generatedAt;

}

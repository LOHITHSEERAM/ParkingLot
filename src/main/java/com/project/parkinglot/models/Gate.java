package com.project.parkinglot.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Gate extends BaseModel{

    @Enumerated(EnumType.STRING)
    GateType gateType;

    int gateNo;

    @OneToOne
    Operator operator;

    @Enumerated(EnumType.STRING)
    GateStatus gateStatus;

    @ManyToOne
    ParkingLot parkingLot;

}

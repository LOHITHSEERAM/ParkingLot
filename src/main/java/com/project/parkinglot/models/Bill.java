package com.project.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@Entity
public class Bill extends BaseModel{

    Integer billId;

    LocalDateTime exitTime;

    double fee;

    @OneToMany(mappedBy = "bill")
    List<Payment> paymentList;

    @OneToOne
    ParkingToken parkingToken;
}

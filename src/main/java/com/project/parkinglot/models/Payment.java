package com.project.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Payment extends BaseModel {

    @Enumerated(EnumType.STRING)
    PaymentType paymentType;

    double amount;

    LocalDateTime date;

    @Enumerated(EnumType.STRING)
    PaymentStatus paymentStatus;

    @ManyToOne
    Bill bill;

}

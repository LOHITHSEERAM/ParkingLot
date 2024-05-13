package com.project.parkinglot.dtos;

import com.project.parkinglot.models.Gate;
import com.project.parkinglot.models.ParkingSlot;
import com.project.parkinglot.models.Vehicle;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.Token;

import java.time.LocalDateTime;


@Setter
@Getter
public class ResponseTokenDTO {

    LocalDateTime entryTime;

    String TokenNo;

    Vehicle vehicle;

    ParkingSlot assignedParkingSlot;

    Gate generatedAt;
}

package com.project.parkinglot.strategies;

import com.project.parkinglot.models.ParkingLot;
import com.project.parkinglot.models.ParkingSlot;
import com.project.parkinglot.models.Vehicle;
import com.project.parkinglot.models.VehicleType;
import org.springframework.stereotype.Component;

@Component
public interface VehicleAssigmentStrategy {

    public ParkingSlot assign(ParkingLot parkingLot, VehicleType vehicleType);
}

package com.project.parkinglot.strategies;


import com.project.parkinglot.models.ParkingLot;
import com.project.parkinglot.models.ParkingSlot;
import com.project.parkinglot.models.VehicleType;
import org.springframework.stereotype.Component;



public class NearestAssigmentStrategy implements VehicleAssigmentStrategy {


    @Override
    public ParkingSlot assign(ParkingLot parkingLot, VehicleType vehicleType) {
        return null;
    }
}

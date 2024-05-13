package com.project.parkinglot.strategies;

import com.project.parkinglot.models.*;
import org.springframework.stereotype.Component;


@Component
public class RandomAssigmentStrategy implements VehicleAssigmentStrategy{

    @Override
    public ParkingSlot assign(ParkingLot parkingLot, VehicleType vehicleType) {

        for(Floor floor : parkingLot.getFloors()) {
            for(ParkingSlot parkingSlot : floor.getParkingSlots()) {
                if(parkingSlot.getVehicleType().equals(vehicleType) && parkingSlot.getParkingSlotStatus().equals(Status.EMPTY)) {
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}

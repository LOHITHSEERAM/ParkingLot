package com.project.parkinglot.services;

import com.project.parkinglot.models.*;
import com.project.parkinglot.repositories.GateRepository;
import com.project.parkinglot.strategies.VehicleAssigmentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TokenService {



    GateRepository gateRepository;

    VehicleAssigmentStrategy vehicleAssigmentStrategy;

    @Autowired
    public TokenService(GateRepository gateRepository, VehicleAssigmentStrategy vehicleAssigmentStrategy) {
        this.gateRepository = gateRepository;
        this.vehicleAssigmentStrategy = vehicleAssigmentStrategy;
    }

    public ParkingToken issueToken(String vehicleNo, int gateId,String ownerName, VehicleType vehicleType) {


        ParkingToken token = new ParkingToken();

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNo(vehicleNo);
        vehicle.setVehicleType(vehicleType);
        vehicle.setOwner_name(ownerName);



        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        Gate gate;
        if (optionalGate.isPresent()) {
            gate = optionalGate.get();
        } else
            throw new IllegalArgumentException("No gate found");

        ParkingLot parkingLot = gate.getParkingLot();
        ParkingSlot parkingSlot = checkSlotAvailability(parkingLot,vehicleType);
        token.setGeneratedAt(gate);
        token.setEntryTime(LocalDateTime.now());
        token.setAssignedParkingSlot(parkingSlot);
        token.setVehicle(vehicle);
        return token;

    }

    public ParkingSlot checkSlotAvailability(ParkingLot parkingLot, VehicleType vehicleType) {

       ParkingSlot parkingSlot =  vehicleAssigmentStrategy.assign(parkingLot,vehicleType);
       if(parkingSlot!=null)
           return parkingSlot;
       else
           throw new IllegalArgumentException("No parking slot found");
    }
}

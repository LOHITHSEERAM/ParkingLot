package com.project.parkinglot.controllers;


import com.project.parkinglot.dtos.RequestTokenDTO;
import com.project.parkinglot.dtos.ResponseTokenDTO;
import com.project.parkinglot.models.ParkingToken;
import com.project.parkinglot.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/token")
public class TokenController {


    TokenService tokenService;

    @Autowired
    TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }



    @PostMapping("/issue")
    public ResponseEntity<ResponseTokenDTO> issueToken(@RequestBody RequestTokenDTO requestTokenDTO) {

        ParkingToken token = tokenService.issueToken(requestTokenDTO.getVehicleNo(),requestTokenDTO.getGateId(),requestTokenDTO.getOwnerName(),requestTokenDTO.getVehicleType());

        ResponseTokenDTO responseTokenDTO = new ResponseTokenDTO();
        responseTokenDTO.setTokenNo(token.getTokenNo());
        responseTokenDTO.setEntryTime(LocalDateTime.now());
        responseTokenDTO.setAssignedParkingSlot(token.getAssignedParkingSlot());
        responseTokenDTO.setGeneratedAt(token.getGeneratedAt());

        return ResponseEntity.ok(responseTokenDTO);

    }
}

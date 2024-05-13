package com.project.parkinglot.repositories;

import com.project.parkinglot.models.ParkingToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TokenRepository extends JpaRepository<ParkingToken, Long> {
}

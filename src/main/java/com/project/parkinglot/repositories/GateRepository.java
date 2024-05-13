package com.project.parkinglot.repositories;

import com.project.parkinglot.models.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GateRepository extends JpaRepository<Gate, Integer> {

}

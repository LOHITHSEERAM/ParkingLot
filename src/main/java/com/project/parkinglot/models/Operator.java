package com.project.parkinglot.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Operator extends BaseModel{

    String name;

    String EmpId;
}

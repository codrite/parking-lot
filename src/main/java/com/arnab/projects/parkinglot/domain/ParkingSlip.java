package com.arnab.projects.parkinglot.domain;


import java.sql.Timestamp;

public interface ParkingSlip {

    Timestamp getEntryTimeStamp();

    Timestamp getExitTimeStamp();

    String getNumberPlateOfCar();

}

package com.arnab.homegrown.parkinglot.domain;

import java.sql.Timestamp;

public interface EntryParkingSlip {

    Timestamp getEntryTimeStamp();

    String getNumberPlateOfCar();

}

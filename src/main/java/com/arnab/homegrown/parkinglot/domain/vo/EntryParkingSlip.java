package com.arnab.homegrown.parkinglot.domain.vo;

import java.sql.Timestamp;

public interface EntryParkingSlip {

    Timestamp getEntryTimeStamp();

    String getNumberPlateOfCar();

}

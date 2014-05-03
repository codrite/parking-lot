package com.arnab.projects.parkinglot.domain;

import java.sql.Timestamp;

public class ParkingSlipVO implements ParkingSlip {

    @Override
    public Timestamp getEntryTimeStamp() {
        return null;
    }

    @Override
    public Timestamp getExitTimeStamp() {
        return null;
    }

    @Override
    public String getNumberPlateOfCar() {
        return null;
    }

}

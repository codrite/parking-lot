package com.arnab.homegrown.parkinglot.domain;

import java.sql.Timestamp;

public class EntryParkingSlipVO implements EntryParkingSlip {

    private Timestamp entryTimeStamp;
    private String carNumberPlate;

    private EntryParkingSlipVO(String carNumberPlate) {
        this.entryTimeStamp = new Timestamp(System.currentTimeMillis());
        this.carNumberPlate = carNumberPlate;
    }

    public static EntryParkingSlip print(String numberPlate) {
        return new EntryParkingSlipVO(numberPlate);
    }

    @Override
    public Timestamp getEntryTimeStamp() {
        return this.entryTimeStamp;
    }

    @Override
    public String getNumberPlateOfCar() {
        return this.carNumberPlate;
    }

}

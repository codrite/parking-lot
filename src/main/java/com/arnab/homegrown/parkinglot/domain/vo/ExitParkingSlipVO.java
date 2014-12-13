package com.arnab.homegrown.parkinglot.domain.vo;

import java.sql.Timestamp;

public class ExitParkingSlipVO implements ExitParkingSlip {

    private EntryParkingSlip entryParkingSlip;
    private Timestamp exitTimeStamp;

    public ExitParkingSlipVO(EntryParkingSlip entryParkingSlip) {
        this.entryParkingSlip = entryParkingSlip;
        this.exitTimeStamp = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public Timestamp getEntryTimeStamp() {
        return entryParkingSlip.getEntryTimeStamp();
    }

    @Override
    public String getNumberPlateOfCar() {
        return entryParkingSlip.getNumberPlateOfCar();
    }

    public Timestamp getExitTimeStamp() {
        return exitTimeStamp;
    }

}

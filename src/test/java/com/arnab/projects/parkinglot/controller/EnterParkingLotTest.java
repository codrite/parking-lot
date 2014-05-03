package com.arnab.projects.parkinglot.controller;

import com.arnab.projects.parkinglot.domain.ParkingSlip;
import com.arnab.projects.parkinglot.test.MockControllers;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Timestamp;

public class EnterParkingLotTest {

    @Test
    public void printAMockParkingSlip() {
        EnterParkingLotController enterParkingLotController = MockControllers.createEnterParkingLotController();
        ParkingSlip parkingSlip = enterParkingLotController.issueAParkingSlip();

        Assert.assertNotNull(parkingSlip);
        Assert.assertTrue("Parking Time Stamp is valid", parkingSlip.getEntryTimeStamp().before(getCurrentTimeStamp()));
        Assert.assertTrue("Parking Exit Time Stamp is empty and correct", parkingSlip.getExitTimeStamp() == null);
        Assert.assertTrue("Car Number Plate is valid", parkingSlip.getNumberPlateOfCar().equals("DL-3C AL 6224"));
    }

    private static Timestamp getCurrentTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }


}

package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.test.MockControllers;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Timestamp;

public class EnterParkingLotTest {

    @Test
    public void printAMockParkingSlip() {
        EnterParkingLotController enterParkingLotController = MockControllers.createEnterParkingLotController();
        EntryParkingSlip entryParkingSlip = enterParkingLotController.issueAParkingSlip();

        Assert.assertNotNull(entryParkingSlip);
        Assert.assertTrue("Parking Time Stamp is valid", entryParkingSlip.getEntryTimeStamp().before(getCurrentTimeStamp()));
        Assert.assertTrue("Car Number Plate is valid", entryParkingSlip.getNumberPlateOfCar().equals("DL-3C AL 6224"));
    }

    private static Timestamp getCurrentTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }


}

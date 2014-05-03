package com.arnab.projects.parkinglot.test;


import com.arnab.projects.parkinglot.controller.EnterParkingLotController;
import com.arnab.projects.parkinglot.domain.ParkingSlip;

import java.sql.Timestamp;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockControllers {

    public static EnterParkingLotController createEnterParkingLotController() {
        // Parking slip mock
        ParkingSlip parkingSlip = mock(ParkingSlip.class);
        when(parkingSlip.getEntryTimeStamp()).thenReturn(new Timestamp(System.currentTimeMillis()));
        when(parkingSlip.getNumberPlateOfCar()).thenReturn("DL-3C AL 6224");

        // Parking lot mock controller
        EnterParkingLotController enterParkingLotController = mock(EnterParkingLotController.class);

        when(enterParkingLotController.issueAParkingSlip()).thenReturn(parkingSlip);

        return enterParkingLotController;
    }

}

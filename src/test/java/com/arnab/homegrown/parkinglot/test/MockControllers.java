package com.arnab.homegrown.parkinglot.test;


import com.arnab.homegrown.parkinglot.controller.EnterParkingLotController;
import com.arnab.homegrown.parkinglot.controller.ExitParkingLotController;
import com.arnab.homegrown.parkinglot.domain.parking.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.EntryParkingSlipVO;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlipVO;

import java.sql.Timestamp;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockControllers {

    public static EnterParkingLotController createEnterParkingLotController() {
        // Parking slip mock
        EntryParkingSlip entryParkingSlip = mock(EntryParkingSlip.class);
        when(entryParkingSlip.getEntryTimeStamp()).thenReturn(new Timestamp(System.currentTimeMillis()));
        when(entryParkingSlip.getNumberPlateOfCar()).thenReturn("DL-3C AL 6224");

        // Parking lot mock controller
        EnterParkingLotController enterParkingLotController = mock(EnterParkingLotController.class);

        when(enterParkingLotController.requestEntry()).thenReturn(entryParkingSlip);

        return enterParkingLotController;
    }

    public static ExitParkingLotController createExitParkingLotController() {
        // Mock exit parking lot
        ExitParkingLotController exitParkingLotController = mock(ExitParkingLotController.class);

        // create receipt on exiting parking lot
        EntryParkingSlip entryParkingSlip = mock(EntryParkingSlip.class);
        when(exitParkingLotController.requestExit(entryParkingSlip)).thenReturn(createReceiptSlip());

        return exitParkingLotController;
    }

    private static ExitParkingSlip createReceiptSlip() {
        EntryParkingSlip entryParkingSlip = EntryParkingSlipVO.print("DL-3C AL 6224");
        return new ExitParkingSlipVO(entryParkingSlip);
    }
}

package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.parking.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlipVO;
import com.arnab.homegrown.parkinglot.test.MockControllers;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExitParkingLotTest {

    @Test
    public void printAReceiptOnExitingParkingLot() {
        ExitParkingLotController exitParkingLotController = MockControllers.createExitParkingLotController();
        EntryParkingSlip entryParkingSlip = mock(EntryParkingSlip.class);
        when(exitParkingLotController.requestExit(entryParkingSlip)).thenReturn(new ExitParkingSlipVO(entryParkingSlip));
        ExitParkingSlip exitReceipt = exitParkingLotController.requestExit(entryParkingSlip);
        Assert.assertNotNull(exitReceipt);
    }



}

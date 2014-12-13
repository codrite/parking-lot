package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.vo.ExitParkingSlip;
import com.arnab.homegrown.parkinglot.test.MockControllers;
import org.junit.Assert;
import org.junit.Test;

public class ExitParkingLotTest {

    @Test
    public void printAReceiptOnExitingParkingLot() {
        ExitParkingLotController exitParkingLotController = MockControllers.createExitParkingLotController();
        ExitParkingSlip exitReceipt = exitParkingLotController.issueAReceipt();
        Assert.assertNotNull(exitReceipt);
    }

}

package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.ExitParkingSlip;
import com.arnab.homegrown.parkinglot.service.ParkingKiosk;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ExitParkingLotController extends AbstractParkingLot {

    @Resource
    private ParkingKiosk parkingKiosk;

    public ExitParkingSlip issueAReceipt() {
        return null;
    }


}

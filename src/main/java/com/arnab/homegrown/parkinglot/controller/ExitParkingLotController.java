package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.parking.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlip;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExitParkingLotController extends AbstractParkingLot {

    @RequestMapping(value = "/exit")
    public ExitParkingSlip requestExit(@RequestParam EntryParkingSlip entryParkingSlip) {
        return parkingKiosk.printReceipt(entryParkingSlip);
    }

}

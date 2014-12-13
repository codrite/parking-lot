package com.arnab.homegrown.parkinglot.controller;

import com.arnab.homegrown.parkinglot.domain.vo.EntryParkingSlip;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 Get a parking slip printed
 on entering the parking lot
 */
@RestController
public class EnterParkingLotController extends AbstractParkingLot {

    @RequestMapping(value = "/requestParkingSlip", method = RequestMethod.GET)
    public EntryParkingSlip issueAParkingSlip() {
        return parkingKiosk.printNewParkingSlip();
    }

}

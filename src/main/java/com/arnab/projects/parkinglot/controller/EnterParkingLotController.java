package com.arnab.projects.parkinglot.controller;

import com.arnab.projects.parkinglot.domain.ParkingSlip;
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
    public ParkingSlip issueAParkingSlip() {
        ParkingSlip parkingSlip = parkingKiosk.printNewParkingSlip();
        return parkingSlip;
    }

}

package com.arnab.projects.parkinglot.controller;

import com.arnab.projects.parkinglot.model.ParkingSlip;
import com.arnab.projects.parkinglot.service.ParkingKiosk;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 Get a parking slip printed on entering the parking lot
 */
@RestController
public class EnterIntoParkingLot {

    @Resource
    private ParkingKiosk parkingKiosk;

    @RequestMapping(value = "/requestForParkingSlip", method = RequestMethod.GET)
    public ParkingSlip issueParkingSlip() {
        ParkingSlip parkingSlip = parkingKiosk.printNewParkingSlip();
        return parkingSlip;
    }

}

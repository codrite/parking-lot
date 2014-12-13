package com.arnab.homegrown.parkinglot.controller;


import com.arnab.homegrown.parkinglot.domain.parking.ParkingKiosk;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/parkingLot")
public class AbstractParkingLot {

    @Resource
    protected ParkingKiosk parkingKiosk;

}

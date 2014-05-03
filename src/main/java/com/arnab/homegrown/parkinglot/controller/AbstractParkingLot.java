package com.arnab.homegrown.parkinglot.controller;


import com.arnab.homegrown.parkinglot.service.ParkingKiosk;

import javax.annotation.Resource;

public class AbstractParkingLot {

    @Resource
    protected ParkingKiosk parkingKiosk;

}

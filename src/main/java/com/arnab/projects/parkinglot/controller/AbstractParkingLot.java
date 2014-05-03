package com.arnab.projects.parkinglot.controller;


import com.arnab.projects.parkinglot.service.ParkingKiosk;

import javax.annotation.Resource;

public class AbstractParkingLot {

    @Resource
    protected ParkingKiosk parkingKiosk;

}

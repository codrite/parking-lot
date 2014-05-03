package com.arnab.projects.parkinglot.service;

import com.arnab.projects.parkinglot.model.ParkingSlip;
import com.arnab.projects.parkinglot.service.exception.ParkingSlipPrintingException;

import javax.annotation.Resource;

@Resource
public interface ParkingKiosk {

    ParkingSlip printNewParkingSlip() throws ParkingSlipPrintingException;

}

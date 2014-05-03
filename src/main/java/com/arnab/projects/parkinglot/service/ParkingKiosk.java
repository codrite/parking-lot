package com.arnab.projects.parkinglot.service;

import com.arnab.projects.parkinglot.domain.ParkingSlip;
import com.arnab.projects.parkinglot.service.exception.ParkingSlipPrintingException;

import javax.annotation.Resource;

@Resource
public interface ParkingKiosk {

    ParkingSlip printNewParkingSlip() throws ParkingSlipPrintingException;

}

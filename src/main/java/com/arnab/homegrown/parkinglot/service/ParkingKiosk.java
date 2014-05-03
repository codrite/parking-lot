package com.arnab.homegrown.parkinglot.service;

import com.arnab.homegrown.parkinglot.domain.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.service.exception.ParkingSlipPrintingException;

import javax.annotation.Resource;

@Resource
public interface ParkingKiosk {

    EntryParkingSlip printNewParkingSlip() throws ParkingSlipPrintingException;

}

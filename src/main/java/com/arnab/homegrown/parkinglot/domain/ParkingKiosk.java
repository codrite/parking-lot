package com.arnab.homegrown.parkinglot.domain;

import com.arnab.homegrown.parkinglot.domain.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.service.exception.ParkingSlipPrintingException;
import org.springframework.stereotype.Service;

@Service
public interface ParkingKiosk {

    EntryParkingSlip printNewParkingSlip() throws ParkingSlipPrintingException;

}

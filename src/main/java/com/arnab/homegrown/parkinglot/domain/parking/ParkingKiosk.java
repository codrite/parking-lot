package com.arnab.homegrown.parkinglot.domain.parking;

import com.arnab.homegrown.parkinglot.domain.parking.vo.EntryParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.vo.ExitParkingSlip;
import com.arnab.homegrown.parkinglot.domain.parking.exception.ParkingKioskException;
import org.springframework.stereotype.Service;

@Service
public interface ParkingKiosk {

    EntryParkingSlip printNewParkingSlip() throws ParkingKioskException;

    ExitParkingSlip printReceipt(EntryParkingSlip entryParkingSlip) throws ParkingKioskException;

}

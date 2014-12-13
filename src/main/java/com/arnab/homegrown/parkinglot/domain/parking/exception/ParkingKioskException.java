package com.arnab.homegrown.parkinglot.domain.parking.exception;


public class ParkingKioskException extends RuntimeException {

    public ParkingKioskException(String message) {
        super(message);
    }

    public ParkingKioskException(String message, Throwable cause) {
        super(message, cause);
    }

}

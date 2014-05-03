package com.arnab.homegrown.parkinglot.service.exception;


public class ParkingSlipPrintingException extends RuntimeException {

    public ParkingSlipPrintingException(String message) {
        super(message);
    }

    public ParkingSlipPrintingException(String message, Throwable cause) {
        super(message, cause);
    }

}

package com.example.transactional.transactionalManagement.dto;

import com.example.transactional.transactionalManagement.entity.passengerInfo;
import com.example.transactional.transactionalManagement.entity.paymentInfo;
public class flightBookingRequest {
    passengerInfo passengerInfo;
    paymentInfo paymentInfo;

    public flightBookingRequest() {
    }

    public flightBookingRequest(com.example.transactional.transactionalManagement.entity.passengerInfo passengerInfo, com.example.transactional.transactionalManagement.entity.paymentInfo paymentInfo) {
        this.passengerInfo = passengerInfo;
        this.paymentInfo = paymentInfo;
    }

    public com.example.transactional.transactionalManagement.entity.passengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public void   setPassengerInfo(com.example.transactional.transactionalManagement.entity.passengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public com.example.transactional.transactionalManagement.entity.paymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(com.example.transactional.transactionalManagement.entity.paymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}

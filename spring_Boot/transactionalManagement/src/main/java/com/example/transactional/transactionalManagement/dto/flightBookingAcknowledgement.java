package com.example.transactional.transactionalManagement.dto;

import com.example.transactional.transactionalManagement.entity.passengerInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
public class flightBookingAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private passengerInfo passengerInfo;

    public flightBookingAcknowledgement() {
    }

    public flightBookingAcknowledgement(String status, double totalFare, String pnrNo, com.example.transactional.transactionalManagement.entity.passengerInfo passengerInfo) {
        this.status = status;
        this.totalFare = totalFare;
        this.pnrNo = pnrNo;
        this.passengerInfo = passengerInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

    public com.example.transactional.transactionalManagement.entity.passengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(com.example.transactional.transactionalManagement.entity.passengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }
}

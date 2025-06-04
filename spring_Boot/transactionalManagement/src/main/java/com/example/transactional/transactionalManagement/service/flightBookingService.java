package com.example.transactional.transactionalManagement.service;

import com.example.transactional.transactionalManagement.dto.flightBookingAcknowledgement;
import com.example.transactional.transactionalManagement.dto.flightBookingRequest;
import com.example.transactional.transactionalManagement.entity.passengerInfo;
import com.example.transactional.transactionalManagement.entity.paymentInfo;
import com.example.transactional.transactionalManagement.repository.passengerInfoRepository;
import com.example.transactional.transactionalManagement.repository.paymentInfoRepository;
import com.example.transactional.transactionalManagement.utils.paymentUtils;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class flightBookingService {
    @Autowired
    passengerInfoRepository passengerRepo;
    @Autowired
    paymentInfoRepository paymentRepository;
    @Transactional
    public flightBookingAcknowledgement bookFlightTicket(flightBookingRequest request){
        passengerInfo passengerIn=request.getPassengerInfo();
         passengerIn=passengerRepo.save(passengerIn);
           //flightBookingAcknowledgement flightBooking=null;
           paymentInfo paymentIn=request.getPaymentInfo();
        paymentUtils.validateCreditLimit(paymentIn.getAccountNo(), passengerIn.getFare());
        paymentIn.setAmount(passengerIn.getFare());
        paymentRepository.save(paymentIn);
        return new flightBookingAcknowledgement
                ("success",passengerIn.getFare(),
                        UUID.randomUUID().toString().split("-")[0],passengerIn);
    }
}

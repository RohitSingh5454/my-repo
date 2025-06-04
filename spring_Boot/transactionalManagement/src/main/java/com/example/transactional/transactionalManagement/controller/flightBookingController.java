package com.example.transactional.transactionalManagement.controller;

import com.example.transactional.transactionalManagement.dto.flightBookingAcknowledgement;
import com.example.transactional.transactionalManagement.dto.flightBookingRequest;
import com.example.transactional.transactionalManagement.service.flightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flightApi")
public class flightBookingController {
    @Autowired
    flightBookingService flightBookingService;

    @PostMapping("/saveBooking")
    public flightBookingAcknowledgement bookFlightTicket(@RequestBody flightBookingRequest request)
    {
        return flightBookingService.bookFlightTicket(request);
    }
}

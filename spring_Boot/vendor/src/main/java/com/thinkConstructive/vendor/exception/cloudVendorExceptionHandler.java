package com.thinkConstructive.vendor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class cloudVendorExceptionHandler {
    @ExceptionHandler(cloudVendorNotFoundException.class)
    public ResponseEntity<Object> handleCloudNotFoundException(cloudVendorNotFoundException cloudVendorNotFoundException){
        cloudVendorException vendorException=new cloudVendorException
                (cloudVendorNotFoundException.getMessage(),cloudVendorNotFoundException.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(vendorException,HttpStatus.NOT_FOUND);
    }
}

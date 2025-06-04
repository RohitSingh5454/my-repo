package com.example.EmployeesDataResignation.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class GenericException extends RuntimeException{
    public final String message;
    public HttpStatus code;
    public String key;
    public String exceptionIdentifier;

    public GenericException(String message) {
        super(message);
        this.message = message;
    }

    public GenericException(String message, HttpStatus code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public GenericException(String message, HttpStatus code, String key) {
        super(message);
        this.message = message;
        this.code = code;
        this.key = key;
    }

    public GenericException(String message, HttpStatus code, String key, String exceptionIdentifier) {
        super(message);
        this.message = message;
        this.code = code;
        this.key = key;
        this.exceptionIdentifier = exceptionIdentifier;
    }
}

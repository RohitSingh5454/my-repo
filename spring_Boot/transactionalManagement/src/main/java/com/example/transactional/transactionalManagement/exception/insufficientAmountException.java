package com.example.transactional.transactionalManagement.exception;

public class insufficientAmountException extends RuntimeException{
    public insufficientAmountException(String msg){
        super(msg);
    }
}

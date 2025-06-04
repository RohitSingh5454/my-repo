package com.example.EmployeesDataResignation.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;
@Data
@Getter
@Setter
public class ResponseMessage <T>{
    private Integer status;
    private String message;
    private String key;
    private T data;
    private List<?> dataList;
    public String exceptionIdentifier;

    public ResponseMessage(String message) {
        this.message = message;
    }

    public ResponseMessage(Integer status, String message) {
        super();
        this.status = status;
        this.message = message;
    }


    public ResponseMessage(Integer status, String message, T data) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseMessage(Integer status, String message, List<?> dataList) {
        super();
        this.status = status;
        this.message = message;
        this.dataList = dataList;
    }

    public ResponseMessage(Integer status, String message, T data,String key) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
        this.key = key;
    }

    public ResponseMessage(Integer status, String message, T data,String key, String exceptionIdentifier) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
        this.key = key;
        this.exceptionIdentifier = exceptionIdentifier;
    }
}

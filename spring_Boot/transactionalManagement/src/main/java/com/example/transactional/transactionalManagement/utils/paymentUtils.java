package com.example.transactional.transactionalManagement.utils;

import com.example.transactional.transactionalManagement.exception.insufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class paymentUtils {
   private static Map<String,Double> paymentMap=new HashMap<>();
    static {
        paymentMap.put("acc1",8000.50);
        paymentMap.put("acc2",7900.59);
        paymentMap.put("acc3",9800.23);
        paymentMap.put("acc4",13000.78);
    }
    public static boolean validateCreditLimit(String accNo,double paidAmount){
        if (paidAmount>paymentMap.get(accNo)){
          throw  new insufficientAmountException("amount payable exceed the balance in account ");
        }
        else {
            return true;
        }
    }

}

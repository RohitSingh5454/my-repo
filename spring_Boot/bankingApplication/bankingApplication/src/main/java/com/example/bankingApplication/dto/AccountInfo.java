package com.example.bankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AccountInfo {
    private String accountName;
    private String accountBalance;
    private String accountNumber;
}

package com.example.geektrust.model;

public class PaymentDTO {

    private String bankName;
    private String borrowerName;
    private long lumpSumAmount;
    private int emiNo;

    public String getBankName() {
        return bankName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public long getLumpSumAmount() {
        return lumpSumAmount;
    }

    public int getEmiNo() {
        return emiNo;
    }
}

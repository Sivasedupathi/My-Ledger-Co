package com.example.geektrust.model;

public class BalanceDTO {

    private String bankName;
    private String borrowerName;
    private int emiNo;

    public String getBankName() {
        return bankName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public int getEmiNo() {
        return emiNo;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setEmiNo(int emiNo) {
        this.emiNo = emiNo;
    }
}

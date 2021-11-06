package com.example.geektrust.model;

public class OutputDTO {

    private String bankName;
    private String borrowerName;
    private long amountPaid;
    private int balanceEmi;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setAmountPaid(long amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setBalanceEmi(int balanceEmi) {
        this.balanceEmi = balanceEmi;
    }
}

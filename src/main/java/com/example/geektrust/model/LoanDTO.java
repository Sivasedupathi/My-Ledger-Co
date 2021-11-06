package com.example.geektrust.model;

public class LoanDTO {

    private String bankName;
    private String borrowerName;
    private long principal;
    private int rateOfInterest;
    private int numberOfYears;

    public String getBankName() {
        return bankName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public long getPrincipal() {
        return principal;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}

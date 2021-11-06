package com.example.geektrust.entities;

public class Interest {

    private long principal;
    private int rateOfInterest;
    private int numberOfYears;
    private final int percentage = 100;

    public Interest(long principal, int numberOfYears, int rateOfInterest) {
        this.principal = principal;
        this.rateOfInterest = rateOfInterest;
        this.numberOfYears = numberOfYears;
    }

    public long getPrincipal() {
        return principal;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    //To Calculate Interest, I = P*N*R
    //where P is principal, N is number of years and R is rate of interest in percentage
    public long calculateSimpleInterest(){

        return (principal * rateOfInterest * numberOfYears)/percentage;
    }
}

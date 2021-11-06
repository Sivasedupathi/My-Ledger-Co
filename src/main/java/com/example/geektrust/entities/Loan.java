package com.example.geektrust.entities;

public class Loan {

    private Interest interest;
    private final int noOfMonthInYear = 12;

    public Loan(Interest interest) {
        this.interest = interest;
    }

    // To calculate the total amount to be re-payed, Loan amount is sum of
    //interest calculated and principal.
    public long calculateLoanAmount(){

        return interest.getPrincipal() + interest.calculateSimpleInterest();
    }

    //To calculate EMI per month
    public long calculateEmiAmount(){

        return calculateLoanAmount() / (interest.getNumberOfYears() * noOfMonthInYear);
    }

}

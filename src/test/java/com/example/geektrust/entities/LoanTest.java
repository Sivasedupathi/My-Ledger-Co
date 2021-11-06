package com.example.geektrust.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

    private Loan loan;
    private Interest interest;

    @Test
    @DisplayName("Loan Calculation test")
    public void testLoanAmountCalculation() {
        //decalre
        interest = new Interest(10000, 5, 4);
        loan = new Loan(interest);
        long expectedLoanAmount = 12000;
        //perform
        long loanAmount = loan.calculateLoanAmount();
        //assert Loan amount and emi amount
        assertEquals(expectedLoanAmount, loanAmount);
    }

    @Test
    @DisplayName("EMI Calculation test")
    public void testEmiAmountCalculation() {
        //decalre
        interest = new Interest(10000, 5, 4);
        loan = new Loan(interest);
        long expectedEmiAmount = 200;
        //perform
        long emiAmount = loan.calculateEmiAmount();
        //assert Loan amount and emi amount
        assertEquals(expectedEmiAmount, emiAmount);
    }

}

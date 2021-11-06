package com.example.geektrust.entities;

import com.example.geektrust.model.BalanceDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {


    @Test
    @DisplayName("Amount paid test")
    public void testAmountPaidCalculation() {
        //decalre
        BalanceDTO input = new BalanceDTO();
        input.setEmiNo(5);
        Balance balance = new Balance(input);
        long expectedAmountPaid = 1000;

        //perform
        long amountPaid = balance.calculateAmountPaid(200,0);
        //assert Loan amount and emi amount
        assertEquals(expectedAmountPaid, amountPaid);
    }

    @Test
    @DisplayName("Balance EMI Calculation test")
    public void testBalanceEmiCalculation() {
        //decalre
        BalanceDTO input = new BalanceDTO();
        input.setEmiNo(5);
        Balance balance = new Balance(input);
        long expectedBalanceEmi = 55;

        //perform
        long balanceEmi = balance.calculateBalanceNoOfEmi(1000,12000,200);
        //assert Loan amount and emi amount
        assertEquals(expectedBalanceEmi,balanceEmi);
    }
}

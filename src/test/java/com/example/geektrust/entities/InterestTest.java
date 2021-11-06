package com.example.geektrust.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterestTest {

    private Interest interest;

    @Test
    @DisplayName("Interest Calculation test")
    public void testInterestCalculation() {
        //decalre
        interest = new Interest(10000,5,4);
        long expected = 2000;
        //perform
        long actual = interest.calculateSimpleInterest();
        //assert
        assertEquals(expected, actual);
    }


}

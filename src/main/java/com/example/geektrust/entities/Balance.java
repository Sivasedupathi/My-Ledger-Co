package com.example.geektrust.entities;

import com.example.geektrust.model.BalanceDTO;

public class Balance {

    private BalanceDTO balance;

    public Balance(BalanceDTO balance) {
        this.balance = balance;
    }

    public long calculateAmountPaid(int emiAmount, int lumpSumAmount) {

        return balance.getEmiNo() * (emiAmount + lumpSumAmount);
    }

    public long  calculateBalanceNoOfEmi(long amountPaid, long loanAmount, long emiAmount) {

        return (loanAmount - amountPaid)/emiAmount;
    }

}

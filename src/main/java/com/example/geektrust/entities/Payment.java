package com.example.geektrust.entities;

import com.example.geektrust.model.PaymentDTO;

import java.util.List;

public class Payment {

    private List<PaymentDTO> paymentList;

    public List<PaymentDTO> getPaymentList() {
        return paymentList;
    }

    //Add the Lump sum and EMI no ot list to use it to calculate balance
    public void addLumpSumAmountToList(PaymentDTO payment){

        paymentList.add(payment);
    }

}

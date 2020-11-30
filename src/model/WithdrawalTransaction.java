/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author Christian
 */
public class WithdrawalTransaction extends Transaction{
    private double amount;

    public WithdrawalTransaction(double amount, String transactionID, Date dateTime) {
        super(transactionID, dateTime);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}

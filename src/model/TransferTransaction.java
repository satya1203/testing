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
public class TransferTransaction extends Transaction{
    private String destinationNumber;
    private double amount;

    public TransferTransaction(String destinationNumber, double amount, String transactionID, Date dateTime) {
        super(transactionID, dateTime);
        this.destinationNumber = destinationNumber;
        this.amount = amount;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}

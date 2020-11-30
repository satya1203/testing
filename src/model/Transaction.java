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
public abstract class Transaction {
    private String transactionID;
    private Date dateTime;

    public Transaction(String transactionID, Date dateTime) {
        this.transactionID = transactionID;
        this.dateTime = dateTime;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Christian
 */
public class ATMCard extends Account{
    private String cardNUmber;
    private String PIN;

    public ATMCard(String cardNUmber, String PIN, String accountNumber, String name, String address, double balance) {
        super(accountNumber, name, address, balance);
        this.cardNUmber = cardNUmber;
        this.PIN = PIN;
    }

    public String getCardNUmber() {
        return cardNUmber;
    }

    public void setCardNUmber(String cardNUmber) {
        this.cardNUmber = cardNUmber;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    
}

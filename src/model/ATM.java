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
public class ATM{
   private String kodeATM;
   private double cash;
   private ActiveEnum status;
   
    public ATM(String kodeATM, double cash, ActiveEnum status) {
        this.kodeATM = kodeATM;
        this.cash = cash;
        this.status = status;
    }

    public String getKodeATM() {
        return kodeATM;
    }

    public void setKodeATM(String kodeATM) {
        this.kodeATM = kodeATM;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ActiveEnum getStatus() {
        return status;
    }

    public void setStatus(ActiveEnum status) {
        this.status = status;
    }
    
}

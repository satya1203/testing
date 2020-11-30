/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import java.util.Date;
import model.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Christian
 */
public class controller {
    public static int counterwithdrawal = 0;
    public static int countertransfer = 0;

    public controller() {
    }
    public ActiveEnum insertCard(ATM atm){
        atm.setStatus(ActiveEnum.ACTIVE);
        return atm.getStatus();
    }
    public boolean validatePIN(ATMCard[] card){
        String CN = JOptionPane.showInputDialog("Masukan nomor kartu anda : ", null);
        String pin = JOptionPane.showInputDialog("Masukan PIN anda : ", null);
        boolean check=false;
        for (int i = 0; i < card.length; i++) {
            if((card[i].getAccountNumber().equals(CN)) && (card[i].getPIN().equals(pin))){
             JOptionPane.showMessageDialog(null,"Selamat datang " + card[i].getName());   
            check = true;
            }else{
                JOptionPane.showMessageDialog(null, "Mohon maaf nomor kartu atau pin anda salah");
            check = false;
            }
        }
        return check;
    }
    public double checkSaldo(ATMCard[] card){
        double saldo=0;
        for (int i = 0; i < card.length; i++) {
            if(validatePIN(card) == true){
                saldo = card[i].getBalance();
            }
        }
        return saldo;
    }
    public boolean withdrawal(ATMCard[] card){
        boolean status = false;
        double nominal = Double.parseDouble(JOptionPane.showInputDialog("Masukan nominal : ", null));
        if(validatePIN(card)== true && checkSaldo(card)>50000){
            for (int i = 0; i < card.length; i++) {
                card[i].setBalance(card[i].getBalance()-nominal);
                status = true;
                JOptionPane.showMessageDialog(null, "Withdrawal berhasil!");
            }
            
        }
        return status;
    }
    public boolean transfer(ATMCard[] card){
        double sisa;
        double trf;
        boolean status = false;
        if(validatePIN(card)== true && checkSaldo(card)>50000){
            String tujuan = JOptionPane.showInputDialog("Masukan nomor kartu tujuan : ", null);
            double nominal = Double.parseDouble(JOptionPane.showInputDialog("Masukan nominal : ", null));
            for (int i = 0; i < card.length; i++) {
                sisa = card[i].getBalance()-nominal;
                for (int j = 0; j < card.length; j++) {
                    if(card[j].getAccountNumber().equals(tujuan)){
                        trf = card[j].getBalance() + nominal;
                        card[j].setBalance(trf);
                        Date tanggal = new Date();
                        countertransfer += 1;
                        new TransferTransaction(tujuan,nominal, Integer.toString(countertransfer),tanggal);
                        JOptionPane.showMessageDialog(null,"Transfer anda berhasil\n Sisa saldo anda : " + sisa);
                        status = true;
                    }else{
                        status = false;
                    }
                }
            }
            
        }
        return status;
    }
    public ActiveEnum ejectCard(ATM atm,ATMCard[] card){ 
        atm.setStatus(ActiveEnum.INACTIVE);
        atm.setKodeATM(null);
        return atm.getStatus();
    }
}

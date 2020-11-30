/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import model.*;
import controller.*;
/**
 *
 * @author Christian
 */
public class view {
    public view(){
        String cn = "1119008";
        String pin = "123";
        double nominal = 100000;
        String tujuan = "1119009";
        String an = "1234";
        String name = "satya";
        String alamat = "Jatiluhur";
        double balance = 2000000;
        ATMCard card = new ATMCard(cn, pin, an, name, alamat, balance);
        ATMCard card1 = new ATMCard(cn, pin, an, name, alamat, balance);
        ATMCard[] listCard = {card,card1};
        
        controller ctrl = new controller();
        ATM atm = new ATM("9999", 0, ActiveEnum.ACTIVE);
        //ctrl.insertCard(atm);
        //ctrl.validatePIN(listCard);
        ctrl.checkSaldo(listCard);
        ctrl.transfer(listCard);
        ctrl.withdrawal(listCard);
        ctrl.ejectCard(atm, listCard);
    }
    public static void main(String[] args) {
        new view();
    }
}

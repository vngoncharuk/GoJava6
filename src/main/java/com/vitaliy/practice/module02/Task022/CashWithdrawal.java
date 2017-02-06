package com.vitaliy.practice.module02.Task022;

/**
 * Created by Vitaliy on 05.02.2017.
 */
public class CashWithdrawal {

    public static void main(String[] args) {

        double totalBalance = 100;
        double summWithdrawal = 99;
        CashWithdrawal transaction = new CashWithdrawal();

        transaction.commissionForCash(totalBalance,summWithdrawal) ;

    }
    //
    public void commissionForCash(double balance, double summWithdrawal) {
        double summ = summWithdrawal;
        double totalbalance = balance;
        double comiss = 0.05;
        comiss *= summ;
        if ((comiss + summWithdrawal) < totalbalance) {
            System.out.println("OK " + comiss + " " + (totalbalance - (comiss + summ)));
        } else {
            System.out.println("NO");
        }
    }

}

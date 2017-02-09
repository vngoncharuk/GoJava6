package com.vitaliy.practice.module02.Task022;

/**
 * Created by Vitaliy on 05.02.2017.
 */
public class CashWithdrawal {
    double comiss = 0.05;
    public static void main(String[] args) {

        double totalBalance = 100;
        double summWithdrawal = 10;
        CashWithdrawal transaction = new CashWithdrawal();

        transaction.commissionForCash(totalBalance,summWithdrawal);
    }
    //test comments 2
    public void commissionForCash(double balance, double summWithdrawal) {
        double summ = summWithdrawal;
        double totalbalance = balance;
        comiss *= summ;
        if ((comiss + summWithdrawal) < totalbalance) {
            System.out.println("OK " + comiss + " " + (totalbalance - (comiss + summ)));
        } else {
            System.out.println("NO");
        }
    }

}

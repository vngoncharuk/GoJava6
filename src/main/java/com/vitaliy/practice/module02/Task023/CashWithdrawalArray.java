package com.vitaliy.practice.module02.Task023;

/**
 * Created by Vitaliy on 05.02.2017.
 */
public class CashWithdrawalArray {

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        int withdrawal = 100;
        CashWithdrawalArray transationByName = new CashWithdrawalArray();

        transationByName.cashTransaction(balances,ownerNames,ownerName,withdrawal);
    }

    public void cashTransaction(int[] balances, String[] ownerNames, String ownerName, int summWithdrawal) {
        int[] allBalances = balances;
        String[] allOwnerNames = ownerNames;
        double summ = summWithdrawal;
        double totalbalance;
        double comiss = 0.05;

        comiss *= summ;

        for (int i = 0; i < allOwnerNames.length; i++) {
            if (allOwnerNames[i] == ownerName) {
                totalbalance = allBalances[i];
                if ((summ + comiss) > totalbalance ) {
                    System.out.println(ownerName + " " + "NO");
                } else {
                    totalbalance -= (summ + comiss);
                    System.out.println(ownerName + " " + summ + " " + totalbalance);
                }
            } else continue;
        }
    }
}

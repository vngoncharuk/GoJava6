package com.vitaliy.practice.module02.Task024;

import com.vitaliy.practice.module02.Task022.CashWithdrawal;

/**
 * Created by Vitaliy on 05.02.2017.
 */
public class CashFunding {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        int funding = 100;

        CashFunding fundingTransaction = new CashFunding();

        fundingTransaction.cashFunding(balances, ownerNames, ownerName, funding);

    }
    public void cashFunding (int[] balances, String[] ownerNames, String person, int summfunding) {
        int[] allBalances = balances;
        String[] allOwnerNames = ownerNames;
        int summ = summfunding;//person can't withdraw double values
        double totalbalance;

        for (int i = 0; i < allOwnerNames.length; i++) {
            if (allOwnerNames[i] == person) {
                totalbalance = allBalances[i];
                totalbalance += summ;
                    System.out.println(person + " " + totalbalance);
                } else continue;
        }


    }

}

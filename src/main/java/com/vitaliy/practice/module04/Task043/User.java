package com.vitaliy.practice.module04.Task043;

import com.vitaliy.practice.module04.Task041.USBank;
import com.vitaliy.practice.module04.Task042.Currency;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class User {
    public static void main(String[] args) {

        USBank bank = new USBank();
        System.out.println(bank.getLimitOfWithdrawal(Currency.USD));
        System.out.println(bank.getLimitOfFunding(Currency.USD));
        System.out.println(bank.getCommission(Currency.USD,1000));
        System.out.println(bank.getCommission(Currency.USD,1001));
        System.out.println(bank.getCommission(Currency.EUR,1000));
        System.out.println(bank.getCommission(Currency.EUR,1001));

    }

}

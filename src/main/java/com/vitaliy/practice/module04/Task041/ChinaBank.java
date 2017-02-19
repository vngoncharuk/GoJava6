package com.vitaliy.practice.module04.Task041;

import com.vitaliy.practice.module04.Task042.Currency;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        return 0;
    }

    @Override
    public int getCommission(int summ) {
        return 0;
    }
}

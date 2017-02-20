package com.vitaliy.practice.module04.Task041;

import com.vitaliy.practice.module04.Task042.Currency;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class EUBank extends Bank {
    public static final int LIMIT_WITHDRAWAL_USD = 2000;
    public static final int LIMIT_WITHDRAWAL_EUR = 2200;
    public static final int LIMIT_FUNDING_USD = 10000;
    public static final int LIMIT_FUNDING_EUR = 20000;
    public static final double MONTH_RATE_USD = 0.00;
    public static final double MONTH_RATE_EUR = 0.01;
    public static final double WITHDRAW_COMMISS_USD_LESS_1000 = 0.05;
    public static final double WITHDRAW_COMMISS_USD_MORE_1000 = 0.07;
    public static final double WITHDRAW_COMMISS_EUR_LESS_1000 = 0.02;
    public static final double WITHDRAW_COMMISS_EUR_MORE_1000 = 0.04;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(Currency currency) {
        if (currency == Currency.USD){
            return LIMIT_WITHDRAWAL_USD;
        }
        return LIMIT_WITHDRAWAL_EUR;
    }

    @Override
    public int getLimitOfFunding(Currency currency) {
        if (currency == Currency.USD){
            return LIMIT_FUNDING_USD;
        }
        return LIMIT_FUNDING_EUR;
    }

    @Override
    public double getMonthlyRate(Currency currency) {
        if (currency == Currency.USD){
            return MONTH_RATE_USD;
        }
        return MONTH_RATE_EUR;
    }

    @Override
    public double getCommission(Currency currency, int summ) {
        if (currency == Currency.USD && summ <= 1000){
            return summ*WITHDRAW_COMMISS_USD_LESS_1000;
        } else if (currency == Currency.USD && summ > 1000) {
            return summ*WITHDRAW_COMMISS_USD_MORE_1000;
        } else if (currency == Currency.EUR && summ <=1000) {
            return summ*WITHDRAW_COMMISS_EUR_LESS_1000;
        }
        return summ*WITHDRAW_COMMISS_EUR_MORE_1000;
    }
}

package com.vitaliy.practice.module04.Task041;

import com.vitaliy.practice.module04.Task042.Currency;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class ChinaBank extends Bank {
    private static final int LIMIT_WITHDRAWAL_USD = 100;
    private static final int LIMIT_WITHDRAWAL_EUR = 150;
    private static final int LIMIT_FUNDING_USD = 10000;
    private static final int LIMIT_FUNDING_EUR = 5000;
    private static final double MONTH_RATE_USD = 0.01;
    private static final double MONTH_RATE_EUR = 0.00;
    private static final double WITHDRAW_COMMISS_USD_LESS_1000 = 0.03;
    private static final double WITHDRAW_COMMISS_USD_MORE_1000 = 0.05;
    private static final double WITHDRAW_COMMISS_EUR_LESS_1000 = 0.1;
    private static final double WITHDRAW_COMMISS_EUR_MORE_1000 = 0.11;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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

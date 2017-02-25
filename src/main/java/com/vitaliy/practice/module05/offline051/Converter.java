package com.vitaliy.practice.module05.offline051;

import java.math.BigDecimal;

/**
 * Created by vitaliy on 23.02.2017.
 */
public class Converter {
    double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public double convert(double amountCurrency){
        double usd = amountCurrency / rate;
        usd = new BigDecimal(usd).setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
        return usd;
    }
}

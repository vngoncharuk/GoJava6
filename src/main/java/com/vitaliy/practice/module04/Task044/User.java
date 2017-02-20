package com.vitaliy.practice.module04.Task044;

import com.vitaliy.practice.module04.Task041.USBank;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class User {
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private USBank bank ;

    @Override
    public String toString() {
        return super.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public USBank getBank() {
        return bank;
    }

    public void setBank(USBank bank) {
        this.bank = bank;
    }
}

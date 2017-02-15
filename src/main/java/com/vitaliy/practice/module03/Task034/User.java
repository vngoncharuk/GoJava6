package com.vitaliy.practice.module03.Task034;

/**
 * Created by vitaliy on 15.02.2017.
 */
public class User {
    private static final double LESSTHAN1000 = 0.05;
    private static final double MORETHAN1000 = 0.1;
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    void paySalary(int salary){
        balance += salary;
        System.out.println("Поступила зарплата в размере: " + salary);
        System.out.println("Баланс составляет: " + balance);
    }

    void withdrawal(int summ){
        if (summ < 1000) {
            balance -= (summ - (summ*LESSTHAN1000));
        } else {
            balance -= (summ - (summ*MORETHAN1000));
        }
        System.out.println("Сумма снятия: " + summ + "; Баланс: " + balance);
    }

    void companyNameLenght(String companyName){
        System.out.println("Длинна имени компании: " + companyName.length() + " символов");
    }

    void monthIncreaser (int addMonth){
        System.out.println("Количество месяцев работы теперь: " + (monthsOfEmployment += addMonth));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }
}

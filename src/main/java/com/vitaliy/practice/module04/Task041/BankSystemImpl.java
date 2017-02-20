package com.vitaliy.practice.module04.Task041;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {

        user.setBalance(user.getBalance() - amount);
    }

    public void fundUser(User user, int amount) {

    }

    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    public void paySalary(User user) {

    }
}

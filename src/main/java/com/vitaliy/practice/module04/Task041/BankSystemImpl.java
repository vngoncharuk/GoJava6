package com.vitaliy.practice.module04.Task041;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();
        double comiss = bank.getCommission(amount);
        if ((comiss + amount) > bank.getLimitOfWithdrawal()) {
            System.out.println("Amount of withdrawal is out of limit!");
        } else {
            user.setBalance(user.getBalance() - comiss - amount);
        }
    }

    public void fundUser(User user, int amount) {
        Bank bank = user.getBank();
        if (amount > bank.getLimitOfFunding()) {
            System.out.println("Amount of funding is out of limit!");
        } else {
            user.setBalance(user.getBalance() + amount);
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank bank1 = fromUser.getBank();
        Bank bank2 = toUser.getBank();
        if (bank1.getCurrency() != bank2.getCurrency()){
            System.out.println("User you are trying send money to doesn't have account with apropriate currency!");
        } else {
            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}

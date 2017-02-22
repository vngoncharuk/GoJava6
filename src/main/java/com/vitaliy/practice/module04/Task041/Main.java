package com.vitaliy.practice.module04.Task041;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class Main{
    public static void main(String[] args) {
        BankSystemImpl bankSystem = new BankSystemImpl();
        USBank bankUS1 = new USBank(1, "USA", Currency.USD, 1500, 5000, 6,1000000);
        USBank bankUS2 = new USBank(2, "USA", Currency.USD, 100, 10000, 7,15000000);
        EUBank bankEU1 = new EUBank(3, "Europe Union", Currency.EUR, 1200, 7000, 7,1300000);
        EUBank bankEU2 = new EUBank(4, "Europe Union", Currency.EUR, 900, 6000, 5,1100000);
        ChinaBank bankOfChina1 = new ChinaBank(5, "China", Currency.USD, 2000, 6000, 5,1500000);
        ChinaBank bankOfChina2 = new ChinaBank(5, "China", Currency.USD, 1800, 9000, 7,1100000);

        User user1 = new User(1,"Oliver Kachinik", "SoftServe", 3000, bankUS1, 1000);
        User user2 = new User(2,"Kurt Rassel", "SoftBreeze", 10000, bankUS2, 2000);
        User user3 = new User(3,"Ann Moss", "Paramaunt Pictures", 5000, bankEU1, 100000);
        User user4 = new User(4,"Steven King", "BookStore", 20000, bankEU2, 2000);
        User user5 = new User(5,"Olegunar Solskjajer", "Dynamo Kyiv", 5000, bankOfChina1, 5500);
        User user6 = new User(6,"Jaap Stam", "FK Zorya", 50000, bankOfChina2, 10000);

        bankSystem.withdrawOfUser(user1, 200);
        bankSystem.fundUser(user1, 300);
        bankSystem.transferMoney(user1,user2,100);
        bankSystem.paySalary(user1);
        System.out.println(user1);
        System.out.println("--------------------------------------------------");
        bankSystem.withdrawOfUser(user2, 200);
        bankSystem.fundUser(user2, 300);
        bankSystem.transferMoney(user2,user1,100);
        bankSystem.paySalary(user2);
        System.out.println(user2);
        System.out.println("--------------------------------------------------");
        bankSystem.withdrawOfUser(user3, 200);
        bankSystem.fundUser(user3, 300);
        bankSystem.transferMoney(user3,user2,100);
        bankSystem.paySalary(user3);
        System.out.println(user3);
        System.out.println("--------------------------------------------------");
        bankSystem.withdrawOfUser(user4, 200);
        bankSystem.fundUser(user4, 300);
        bankSystem.transferMoney(user4,user3,100);
        bankSystem.paySalary(user4);
        System.out.println(user4);
        System.out.println("--------------------------------------------------");
        bankSystem.withdrawOfUser(user5, 200);
        bankSystem.fundUser(user5, 300);
        bankSystem.transferMoney(user5,user4,100);
        bankSystem.paySalary(user5);
        System.out.println(user5);
        System.out.println("--------------------------------------------------");
        bankSystem.withdrawOfUser(user6, 200);
        bankSystem.fundUser(user6, 300);
        bankSystem.transferMoney(user6,user5,100);
        bankSystem.paySalary(user6);
        System.out.println(user6);



    }

}

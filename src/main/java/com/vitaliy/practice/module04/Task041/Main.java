package com.vitaliy.practice.module04.Task041;

/**
 * Created by vitaliy on 19.02.2017.
 */
public class Main{
    public static void main(String[] args) {
        BankSystemImpl bankSystem = new BankSystemImpl();
        USBank bankUS1 = new USBank(1, "USA", Currency.USD, 500, 5000, 6,1000000);
        EUBank bankEU = new EUBank(1, "Europe Union", Currency.EUR, 1000, 7000, 7,1200000);
        ChinaBank bankOfChina = new ChinaBank(1, "China", Currency.USD, 1500, 6000, 5,1500000);

        User user1 = new User(1,"Oliver Kachinik", "SoftServe", 3000, bankUS1, 1000);
//        User user2 = new User(2,"Kurt Rassel", "SoftBreeze", 10000, 2000);
//        User user3 = new User(3,"Ann Moss", "Paramaunt Pictures", 5000, 100000);
//        User user4 = new User(4,"Steven King", "BookStore", 20000, 2000);
//        User user5 = new User(5,"Olegunar Solskjajer", "Dynamo Kyiv", 5000,5500);
//        User user6 = new User(6,"Jaap Stam", "FK Zorya", 50000, 10000);

        System.out.println(user1);


    }

}

package com.vitaliy.practice.module03.Task034;

/**
 * Created by vitaliy on 16.02.2017.
 */
public class Workers {
    public static void main(String[] args) {

        String company = "Samsung Electronics";

        User employee = new User();
        employee.paySalary(10000);
        employee.withdrawal(900);
        employee.withdrawal(1500);
        employee.companyNameLenght(company);
        employee.monthIncreaser(5);
    }
}

package com.vitaliy.practice.module03.Task033;
import java.util.Date;
/**
 * Created by vitaliy on 15.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Course firstCourse = new Course(new Date(20170301), "Math");
        //Course secondCourse  = new Course()
        System.out.println(firstCourse.getName());
        System.out.println(firstCourse.getStartDate());
    }
}

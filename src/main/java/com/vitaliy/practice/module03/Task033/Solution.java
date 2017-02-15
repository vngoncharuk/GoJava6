package com.vitaliy.practice.module03.Task033;

import java.util.Date;
/**
 * Created by vitaliy on 15.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        Course firstCourse = new Course(date,"Math");
        Course secondCourse = new Course(date,"Geografy");
        Course thirdCourse = new Course(100, "Phisics","Geaorge Makinsky");
        Course fourthCourse = new Course(120, "History", "Michael");
        Course fifthCourse = new Course(date,"Ecology");
        Student firstStudent = new Student("Nick","Bazus",1);
        Student secondStudent = new Student("Trump", firstCourse);
        CollegeStudent firstColStudent = new CollegeStudent("Vasya","Pupkin", 2);
        CollegeStudent secondColStudent = new CollegeStudent("Vostrikov", secondCourse);
        CollegeStudent thirdColStudent = new CollegeStudent("Harvard", 10,2);
        SpecialStudent firstSpStudent = new SpecialStudent(450);
        SpecialStudent secondSpStudent = new SpecialStudent("Petya","Burin",3);
        SpecialStudent thirdSpStudent = new SpecialStudent("Pitertsev", thirdCourse);
    }
}

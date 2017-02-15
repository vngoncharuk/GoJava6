package com.vitaliy.practice.module03.Task033;

/**
 * Created by vitaliy on 15.02.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] courseTaken;
    private int age;

    public Student() {
    }

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] courseTaken) {
        this.lastName = lastName;
        this.courseTaken = courseTaken;
    }
}

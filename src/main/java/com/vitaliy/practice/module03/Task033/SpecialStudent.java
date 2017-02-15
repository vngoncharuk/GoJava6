package com.vitaliy.practice.module03.Task033;

/**
 * Created by vitaliy on 15.02.2017.
 */
public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }
}

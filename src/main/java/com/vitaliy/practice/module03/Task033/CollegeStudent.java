package com.vitaliy.practice.module03.Task033;

/**
 * Created by vitaliy on 15.02.2017.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent() {
    }

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
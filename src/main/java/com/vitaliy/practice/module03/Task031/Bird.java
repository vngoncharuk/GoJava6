package com.vitaliy.practice.module03.Task031;

/**
 * Created by vitaliy on 13.02.2017.
 */
public class Bird {
    private static final String SINGING = "I am walking\n" +
            "I am flying\n" +
            "I am singing\n" +
            "I am Bird";
    private String name;

    public static void main(String[] args) {
        Bird birdVoody = new Bird("Voody");
        birdVoody.sing();

        Bird bird = new Bird();
        bird.sing();
    }
    public Bird() {
    }
    public Bird(String name) {
        this.name = name;
    }
    public void sing() {
        if (name != null) {
            System.out.println("I am a " + name);
        }
        System.out.println(SINGING);
    }
}

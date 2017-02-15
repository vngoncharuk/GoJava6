package com.vitaliy.practice.module03.Task031;

/**
 * Created by vitaliy on 13.02.2017.
 */
public class Bird {
    private final String WALKING = "I am walking";
    private final String SINGING = "I am flying";
    private final String FLYING = "I am singing";
    private final String SELFCONSCIOUSNESS = "I am a Bird";
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
        if (name == null) {
            System.out.println(WALKING);
            System.out.println(SINGING);
            System.out.println(FLYING);
            System.out.println(SELFCONSCIOUSNESS);
        } else {
            System.out.println("I am a " + name);
            System.out.println(WALKING);
            System.out.println(SINGING);
            System.out.println(FLYING);
            System.out.println(SELFCONSCIOUSNESS);
        }
    }
}

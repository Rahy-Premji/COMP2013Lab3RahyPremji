package com.COMP2013;

public class Crocodile extends Reptile {
    public Crocodile() {
        super("Crocodile");
    }

    @Override
    public void eat() {
        System.out.println("Crocodile is eating a lot of humans");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining Crocodile - idk descaling it");
    }
}
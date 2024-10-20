package com.COMP2013;

public class Frog extends Amphibian{

    public Frog() {
        super("Frog");
    }

    @Override
    public void eat() {
        System.out.println("frog is eating a lot of bugs");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining Frog - frogging");
    }
}

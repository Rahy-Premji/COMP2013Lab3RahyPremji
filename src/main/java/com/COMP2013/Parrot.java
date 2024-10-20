package com.COMP2013;

public class Parrot extends Bird {
    public Parrot() {
        super("Parrot");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seed");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining Parrot -  cleaning the parrot");
    }
}
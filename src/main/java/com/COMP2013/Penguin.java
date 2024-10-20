package com.COMP2013;


public class Penguin extends Bird {
    public Penguin() {
        super("Penguin");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating ltos of fish");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining Penguin - cleaning the penguinn");
    }
}

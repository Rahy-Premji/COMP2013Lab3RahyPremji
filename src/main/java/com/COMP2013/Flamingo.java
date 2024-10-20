package com.COMP2013;

public class Flamingo extends Bird {
    public Flamingo() {
        super("Flamingo");
    }

    @Override
    public void eat() {
        System.out.println("Flamingo is eating whatever flamingos eat");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining Flamingo - clearning the flamingo");
    }
}
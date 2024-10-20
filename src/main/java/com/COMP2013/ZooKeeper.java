package com.COMP2013;

public class ZooKeeper extends Employee{

    public ZooKeeper(String name) {
        super(name);
        this.setSalary(15000);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (getSalary() * 0.05 + 100);
    }
}

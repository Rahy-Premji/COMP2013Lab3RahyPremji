package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {

        Zoo.numZoos = 0;

        Zoo londonZoo = new Zoo("London", 40);
        Zoo tokyoZoo = new Zoo("Tokyo", 35);
        Zoo newYorkZoo = new Zoo("New York", 45);
        Zoo parisZoo = new Zoo("Paris", 50);
        Zoo beestonZoo = new Zoo("Beeston", 25);

        ZooCorp megaZoo = new ZooCorp(londonZoo);

        // Print information for all five zoos
        System.out.println(londonZoo.printInfo());
        System.out.println(tokyoZoo.printInfo());
        System.out.println(newYorkZoo.printInfo());
        System.out.println(parisZoo.printInfo());
        System.out.println(beestonZoo.printInfo());

        beestonZoo.buildNewCompound();
        System.out.println(beestonZoo.printInfo());

        System.out.println("Number of Zoos: "+Zoo.numZoos);

        Employee sue = new ZooKeeper("sue");
        Employee bob = new Admin("bob");
        Employee kareena = new Admin("kareena");


        megaZoo.addStaff(sue);
        megaZoo.addStaff(bob);
        megaZoo.addStaff(kareena);
        System.out.println(sue.getClass().getSimpleName()+":"+sue.getEmployeeName()+":"+sue.calculateChristmasBonus());
        System.out.println(bob.getClass().getSimpleName()+":"+bob.getEmployeeName()+":"+bob.calculateChristmasBonus());


        Animal penguin = new Penguin();
        penguin.maintain();



    }
}

package com.COMP2013;

import java.util.ArrayList;

public class Compound {

    private String type;
    private ArrayList<Animal> animals;


    public Compound() {
        this.animals = new ArrayList<>();

    }

    public Compound(String type) {
        this.type = type;
        this.animals = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    @Override
    public String toString() {
        return "Compound Type: " + type;
    }
}

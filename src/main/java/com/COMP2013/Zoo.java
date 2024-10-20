package com.COMP2013;

import java.util.ArrayList;

public class Zoo {

    private String location;
    private Integer numCompounds;
    public static int numZoos;
    public int zooID;
    private ArrayList<Compound> compounds;

    public Zoo(String location, Integer numCompounds) {
        this.setLocation(location);
        this.setCompounds(numCompounds);
        this.zooID = ++numZoos;
        compounds = new ArrayList<Compound>();
        for (int i=0; i<numCompounds;i++){
            addCompound(new Compound());
        }

    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }


    public Zoo(){
        this.setLocation("unknown");
        this.setCompounds(30);
        this.zooID = ++numZoos;
    }

    public int getZooID() {
        return zooID;
    }

    public void setCompounds(int numCompounds) {
        this.numCompounds = numCompounds;
    }

    public void buildNewCompound(){
        this.numCompounds += 1;
    }

    public Integer getCompounds(){
        return this.numCompounds;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String printInfo() {
        return "Zoo ID: " + this.getZooID() + ", Location: " + this.getLocation() + ", Compounds: " + this.getCompounds();
    }
}

package com.COMP2013;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZooCorp {

    private ArrayList<Zoo> zoos;
    private ArrayList<Employee> employees;


    public ZooCorp(Zoo zoo){

        zoos = new ArrayList<Zoo>();
        employees = new ArrayList<Employee>();

        addZoo(zoo);
    }

    public void addZoo(Zoo zoo) {
        this.zoos.add(zoo);
    }

    public void removeZoo(Zoo zoo) {
        this.zoos.remove(zoo);
    }

    public void addStaff(Employee employee){
        this.employees.add(employee);
    }

    public void removeStaff(Employee employee){
        this.employees.remove(employee);
    }
}

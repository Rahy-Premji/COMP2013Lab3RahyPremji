package com.COMP2013;

public abstract class Employee implements Employable{

    private String name;
    private Integer EmpID;
    private Integer salary;
    public static int numEmps;

    public Employee(String name) {
        this.setEmployeeName(name);
        numEmps++;
        this.setEmployeeID(numEmps);
        this.setSalary(0);
    }

    @Override
    public void setEmployeeID(int number) {

    }

    @Override
    public int getEmployeeID() {
        return EmpID;
    }


    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
//    public int calculateChristmasBonus() {
//        return 0;
//    }
}

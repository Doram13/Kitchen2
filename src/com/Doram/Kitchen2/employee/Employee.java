package com.Doram.Kitchen2.employee;

public abstract class Employee {
    protected String name;
    protected final int birth;
    protected int salary;

    public Employee(String name, int birth, int salary) {
        this.name = name;
        this.birth = birth;
        this.salary = salary;
    }

    public void countTax() {
        System.out.println("He should pay " +salary * 0.99 + " tax.");}

}

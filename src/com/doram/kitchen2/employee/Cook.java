package com.doram.kitchen2.employee;

import com.doram.kitchen2.Cooker;

public class Cook extends Employee implements Cooker {
    private boolean gotKnifeSet = false;


    public Cook(String name, int birth, int salary) {
        super(name, birth, salary);
        System.out.println(name + " has been hired. He has got his knifeset: " + gotKnifeSet);
        countTax();
    }

    public void receiveKnifeSet() {
        this.gotKnifeSet = true;
        System.out.println(name + " has got his knifeset: " + gotKnifeSet);
    }



    public void cook() {
        System.out.println(name + " is cooking: dirts his/her hands and get the job done");
    }



}

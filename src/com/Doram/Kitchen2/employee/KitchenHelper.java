package com.Doram.Kitchen2.employee;

import com.Doram.Kitchen2.Ingredient;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class KitchenHelper extends Employee {
    private Map<Ingredient, Integer> basket = new HashMap<>();
    private Random rnd = new Random();

    public KitchenHelper(String name, int birth, int salary) {
        super(name, birth, salary);
        countTax();
        System.out.println(name + " has been hired.");
    }

    public void stockUp() {
        for(Ingredient ingredient : Ingredient.values()) {
            final int amount = rnd.nextInt(4);
            basket.put(ingredient, amount);
        }
        System.out.println(this.name + " has " + basket.toString());
    }

    public boolean tryToGive(Ingredient ingredient) {
        if (basket.get(ingredient) > 0) {
            int newValue = basket.get(ingredient) -1;
            basket.put(ingredient, newValue);
            System.out.println(name + " is giving " + ingredient + " to the Chef.");
            return true;
        }
        else {
            System.out.println(name + " is NOT able to give " + ingredient + ". He has none of it.");
            return false;

        }
            }


    public void weAreAllOut() {
        System.out.println("We are all out!");
    }
}

package com.doram.kitchen2.employee;

import com.doram.kitchen2.CookCaller;
import com.doram.kitchen2.Cooker;
import com.doram.kitchen2.Ingredient;
import com.doram.kitchen2.IngredientProvider;

public class Chef extends Employee implements Cooker {
  //  private Optional<IngredientProvider> provider = Optional.empty();
  private boolean gotKnifeSet = false;

    public Chef(String name, int birth, int salary) {
        super(name, birth, salary);
        System.out.println(name + " has been hired. He has got his knifeset: " + gotKnifeSet);
        countTax();
    }

    public void receiveKnifeSet() {
        this.gotKnifeSet = true;
        System.out.println(name + " has got his knifeset: " + gotKnifeSet);
    }

    public void cook() {
        System.out.println(name + " can start cooking");
     }

     public void outOfIngredient() {
         System.out.println("I cannot cook without ingredients!");
     }

     public boolean askForIngredient(IngredientProvider IngredientProvider) {
         Ingredient wantedIngredient = Ingredient.getRandom();
         System.out.println("I'm " + name + ". Gimme some " + wantedIngredient);
         return IngredientProvider.provideIngredient(wantedIngredient);
     }

     public void OrderCooksToCook(CookCaller cookCaller) {
         System.out.println(name + " yells to Cooks to cook!");
        cookCaller.callCook();
     }




}

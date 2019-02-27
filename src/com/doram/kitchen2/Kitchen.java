package com.doram.kitchen2;

import com.doram.kitchen2.employee.Chef;
import com.doram.kitchen2.employee.Cook;
import com.doram.kitchen2.employee.Employee;
import com.doram.kitchen2.employee.KitchenHelper;

import java.util.LinkedList;
import java.util.List;


public class Kitchen implements IngredientProvider, CookCaller {
    private Chef chef;
    private List<Cook> cookList = new LinkedList<>();
    private List<KitchenHelper> kitchenHelperList = new LinkedList<>();


    public void hire(Employee employee) {
        if (employee instanceof Chef) {
            hire((Chef) employee);
        }
        if (employee instanceof Cook) {
            hire((Cook) employee);
        }
        if (employee instanceof KitchenHelper) {
            hire((KitchenHelper) employee);
        }
    }

    private void hire(Chef chef) {
        this.chef = chef;
    }

    private void hire(Cook cook) {
        cookList.add(cook);
    }
    private void hire(KitchenHelper helper) {
        kitchenHelperList.add(helper);
    }
    public void conductAShift() {
        chef.receiveKnifeSet();
        for (Cook cook: cookList) {
            cook.receiveKnifeSet();
        }
        kitchenHelperList.forEach(KitchenHelper::stockUp);
        for (int i = 0; i < 25; i++) {
            chefYells();
            //callCook();
        }
    }

    private void chefYells() {
        if (chef.askForIngredient(this)) {
            chef.cook();
            chef.OrderCooksToCook(this);
        }
        else chef.outOfIngredient();
    }

    @Override
    public boolean provideIngredient(Ingredient wantedIngredient) {
        for (KitchenHelper helper: kitchenHelperList) {
             boolean gotIngredient = helper.tryToGive(wantedIngredient);
             if (gotIngredient) {return true;}
        }
        for (KitchenHelper helper: kitchenHelperList) {
            helper.weAreAllOut();
        }
        return false;
    }


    @Override
    public void callCook() {
        for (Cook cook: cookList) {
            cook.cook();
        }
    }
}



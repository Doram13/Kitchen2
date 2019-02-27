package com.doram.kitchen2;

import java.util.Random;

public enum Ingredient {
    CARROT,
    MEAT,
    POTATO;

    private static final Random rnd = new Random();

    static public Ingredient getRandom() {
        int num = rnd.nextInt(3);
        Ingredient wantedIngredient = null;
        switch (num) {
            case 0: wantedIngredient = Ingredient.POTATO;
                break;
            case 1: wantedIngredient = Ingredient.CARROT;
                break;
            case 2: wantedIngredient = Ingredient.MEAT;
                break;
            default:
                System.out.println("This should be never seen! Ingredient.getRandom()");
                break;
        }
        return wantedIngredient;
    }
}


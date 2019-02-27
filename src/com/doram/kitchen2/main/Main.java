package com.doram.kitchen2.main;

import com.doram.kitchen2.Kitchen;
import com.doram.kitchen2.employee.Chef;
import com.doram.kitchen2.employee.Cook;
import com.doram.kitchen2.employee.KitchenHelper;

public class Main {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.hire(new KitchenHelper("bela1", 1987, 100));
        kitchen.hire(new KitchenHelper("bela2", 1986, 100));
        kitchen.hire(new KitchenHelper("bela3", 1985, 100));
        kitchen.hire(new KitchenHelper("bela4", 1984, 100));
        kitchen.hire(new Cook("kukta1", 1975, 300));
        kitchen.hire(new Cook("kukta2", 1972, 300));
        kitchen.hire(new Chef("Ramsay", 1983, 500));

        kitchen.conductAShift();
    }
}

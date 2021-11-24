package com.example.sprint2;

import MenuItems.MenuItem;
import MenuItems.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("custom", MenuItem.sizes.X_LARGE);
        pizza.setCheese("extra");
        pizza.setSauce("white sauce");
        pizza.addTopping("mushrooms");
        pizza.addTopping("sausage");
        pizza.addTopping("sardines");

        System.out.println(pizza);

        pizza.removeTopping("sardines");

        System.out.println(pizza);
    }
}

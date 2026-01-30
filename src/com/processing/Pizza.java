package com.processing;

import java.util.Arrays;

public class  Pizza {
    private Crust crust;
    private Cheese cheese;
    private Sauce sauce;
    private Topping[] toppings;

    public Pizza(Crust crust, Cheese cheese, Sauce sauce, Topping[] toppings) {
        this.crust = crust;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Pizza(Pizza pizza) {
        // Shallow copy of the pizza
//        this.crust = pizza.getCrust();
//        this.cheese = pizza.getCheese();
//        this.sauce = pizza.getSauce();
//        this.toppings = pizza.getToppings();

            this.crust = new Crust(new Cheese(pizza.getCrust().getCheese().getType()));
            this.cheese = new Cheese(pizza.getCheese().getType());
            this.sauce = new Sauce(pizza.getSauce().getColor());
            this.toppings = new Topping[pizza.getToppings().length];
            for (int i = 0; i < pizza.getToppings().length; i++) {
                this.toppings[i] = new Topping(pizza.getToppings()[i].getType());
            }


    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    public void setToppings(Topping[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust=" + crust +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}

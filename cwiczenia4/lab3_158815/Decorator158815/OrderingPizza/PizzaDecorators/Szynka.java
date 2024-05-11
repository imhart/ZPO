package Decorator.OrderingPizza.PizzaDecorators;

import Decorator.OrderingPizza.Pizza;

public class Szynka extends Pizza {

    Pizza pizza;

    public Szynka(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Ham";
    }
}

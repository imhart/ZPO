package Decorator.OrderingPizza.PizzaDecorators;

import Decorator.OrderingPizza.Pizza;

public class Ser extends Pizza {
    private Pizza pizza;

    public Ser(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}

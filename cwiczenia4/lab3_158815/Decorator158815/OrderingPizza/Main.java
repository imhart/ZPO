package Decorator.OrderingPizza;

import Decorator.OrderingPizza.PizzaDecorators.Ser;
import Decorator.OrderingPizza.PizzaDecorators.Szynka;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza = new Ser(pizza);

        System.out.println(pizza.getDescription());

        pizza = new Szynka(pizza);
        System.out.println(pizza.getDescription());
    }
}

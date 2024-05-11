package Decorator.OrderingPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String description = "Pizza";

    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

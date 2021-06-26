package com.component;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDesciption(){
        return description;
    }

    public abstract double cost();
}

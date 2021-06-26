package com.decorator;

import com.component.Beverage;

public class Caramel extends AddOnDecorator{

    Beverage beverage;

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesciption() {
        return beverage.getDesciption() + ", Caramel";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }
    
}

package com.decoratorPattern;

import com.component.Beverage;
import com.component.Espresso;
import com.decorator.Caramel;

public class coffeeShop {
    public static void main(String args[]){
        System.out.println("This is observer pattern.");

        //Beverage without any condiment
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesciption() + " ₹" + beverage.cost());
        //Beverage with 1 caramel condiment 
        Beverage beverage2 = new Caramel(new Espresso());
        System.out.println(beverage2.getDesciption() + " ₹" + beverage2.cost());
        //Beverage with 2 Caramel condiment
        Beverage beverage3 = new Caramel(new Caramel(new Espresso()));
        System.out.println(beverage3.getDesciption() + " ₹" + beverage3.cost());
    }
}

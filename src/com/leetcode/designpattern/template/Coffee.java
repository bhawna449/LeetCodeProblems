package com.leetcode.designpattern.template;

public class Coffee extends Beverage {

    public Coffee() {
        super(BeverageType.COFFEE);
    }

    @Override
    void brew() {

        System.out.println("Brewing coffee into boling water");
    }

    @Override
    void addCondiments() {

        System.out.println("Adding sugar and milk to coffee");

    }

}

package com.leetcode.designpattern.template;

public class Tea extends Beverage {

    public Tea() {
        super(BeverageType.TEA);
    }

    @Override
    void brew() {

        System.out.println("Adding tea bag into boling water");
    }

    @Override
    void addCondiments() {

        System.out.println("Adding lemon into tea");

    }

}

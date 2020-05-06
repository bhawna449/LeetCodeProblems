package com.leetcode.designpattern.template;

public abstract class Beverage {

    BeverageType beverageType;
    boolean hasCondiment;

    public Beverage(BeverageType beverageType) {
        this.beverageType = beverageType;
    }

    public void prepareBeverage() {
        boilWater();
        brew();
        pourBeverage();
        if (hasCondiment) {
            addCondiments();
        }
    }

    public void boilWater() {

        System.out.println("Boling water for " + beverageType);
    }

    abstract void brew();

    public void pourBeverage() {
        System.out.println("Pouring " + beverageType + " in cup");

    }

    abstract void addCondiments();

    public boolean isHasCondiment() {
        return hasCondiment;
    }

    public void setHasCondiment(boolean hasCondiment) {
        this.hasCondiment = hasCondiment;
    }

}

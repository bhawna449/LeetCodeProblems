package com.leetcode.designpattern.template;

public class BeverageTest {

    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.setHasCondiment(true);
        tea.prepareBeverage();

        System.out.println("***********************************");
        
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

    }

}

package com.leetcode.designpattern.state;

public class MainClass {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(1000);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(1000);

    }

}

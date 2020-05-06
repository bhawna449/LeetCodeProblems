package com.leetcode.designpattern.state;

public class NoCash implements ATMState {

    ATMMachine atnMachine;

    public NoCash(ATMMachine atnMachine) {
        super();
        this.atnMachine = atnMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We dont't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We dont't have money");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("We dont't have money");

    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("We dont't have money");

    }

}

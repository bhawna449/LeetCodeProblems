package com.leetcode.designpattern.state;

public class HasPin implements ATMState {
    ATMMachine atnMachine;

    public HasPin(ATMMachine atnMachine) {
        super();
        this.atnMachine = atnMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already insrted by user");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected by user");
        atnMachine.setAtmState(atnMachine.getNoCard());

    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin already insrted by user");

    }

    @Override
    public void withdrawCash(int cash) {
        int remainingCash = atnMachine.getTotalCash() - cash;
        if (remainingCash >= 0) {
            atnMachine.setTotalCash(remainingCash);
            atnMachine.setAtmState(atnMachine.getNoCard());
            System.out.println("Cash withdran succesfull");
        } else {
            System.out.println("Cash not available");
            atnMachine.setAtmState(atnMachine.getNoCard());
        }

    }

}
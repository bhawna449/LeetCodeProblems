package com.leetcode.designpattern.state;

public class NoCard implements ATMState {

    ATMMachine atnMachine;

    public NoCard(ATMMachine atnMachine) {
        super();
        this.atnMachine = atnMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card insrted by user");
        atnMachine.setAtmState(atnMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Card not insrted by user");

    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Card not insrted by user");

    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("Card not insrted by user");

    }

}

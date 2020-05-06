package com.leetcode.designpattern.state;

public class HasCard implements ATMState {
    ATMMachine atnMachine;

    public HasCard(ATMMachine atnMachine) {
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
        if (pin == 1234) {
            atnMachine.setPinCorrect(true);
            System.out.println("Correct pin   insrted by user");
            atnMachine.setAtmState(atnMachine.getHasPin());

        } else {
            System.out.println("InCorrect pin   insrted by user");
            atnMachine.setAtmState(atnMachine.getNoCard());

        }
    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("Pin  not insrted by user");

    }

}
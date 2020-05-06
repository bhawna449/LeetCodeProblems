package com.leetcode.designpattern.state;

public class ATMMachine {

    ATMState atmState;

    ATMState noCard;
    ATMState hasCard;
    ATMState hasPin;
    ATMState noCash;

    boolean pinCorrect;
    int totalCash;

    public ATMMachine() {

        this.noCard = new NoCard(this);
        this.hasCard = new HasCard(this);
        this.hasPin = new HasPin(this);
        this.noCash = new NoCash(this);
        this.pinCorrect = false;
        this.totalCash = 2000;

        atmState = noCard;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void enterPin(int pin) {
        atmState.enterPin(pin);
    }

    public void withdrawCash(int cash) {
        atmState.withdrawCash(cash);
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public void setNoCard(ATMState noCard) {
        this.noCard = noCard;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public void setHasCard(ATMState hasCard) {
        this.hasCard = hasCard;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public void setHasPin(ATMState hasPin) {
        this.hasPin = hasPin;
    }

    public ATMState getNoCash() {
        return noCash;
    }

    public void setNoCash(ATMState noCash) {
        this.noCash = noCash;
    }

    public boolean isPinCorrect() {
        return pinCorrect;
    }

    public void setPinCorrect(boolean pinCorrect) {
        this.pinCorrect = pinCorrect;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }

}

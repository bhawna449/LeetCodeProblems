package com.leetcode.designpattern.state;

public interface ATMState {

    public void insertCard();

    public void ejectCard();

    public void enterPin(int pin);

    public void withdrawCash(int cash);

}

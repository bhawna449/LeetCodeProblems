package com.leetcode.designpattern.chainofresponsibility;

public class Divison implements Operation {

    Operation nextOperation;

    @Override
    public void calculate(NumberOperations numberOperations) {

        if (numberOperations.getOperationType() == OperationType.DIV) {
            System.out.println(Math.floorDiv(numberOperations.getNumber1(), numberOperations.getNumber2()));
        } else {
            System.out.println("No other options possible yet");
        }
    }

    @Override
    public void nextHandle(Operation operation) {
        this.nextOperation = operation;

    }

}

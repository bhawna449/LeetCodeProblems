package com.leetcode.designpattern.chainofresponsibility;

public class Subtraction implements Operation {

    Operation nextOperation;

    @Override
    public void calculate(NumberOperations numberOperations) {

        if (numberOperations.getOperationType() == OperationType.SUB) {
            System.out.println(Math.subtractExact(numberOperations.getNumber1(), numberOperations.getNumber2()));
        } else {
            nextOperation.calculate(numberOperations);
        }
    }

    @Override
    public void nextHandle(Operation operation) {
        this.nextOperation = operation;

    }

}

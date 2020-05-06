package com.leetcode.designpattern.chainofresponsibility;

public class Multiplication implements Operation {

    Operation nextOperation;

    @Override
    public void calculate(NumberOperations numberOperations) {

        if (numberOperations.getOperationType() == OperationType.MUL) {
            System.out.println(Math.multiplyExact(numberOperations.getNumber1(), numberOperations.getNumber2()));
        } else {
            nextOperation.calculate(numberOperations);
        }
    }

    @Override
    public void nextHandle(Operation operation) {
        this.nextOperation = operation;

    }

}

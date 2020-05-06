package com.leetcode.designpattern.chainofresponsibility;

public class Addition implements Operation {

    Operation nextOperation;

    @Override
    public void calculate(NumberOperations numberOperations) {

        if (numberOperations.getOperationType() == OperationType.ADD) {
            System.out.println(Math.addExact(numberOperations.getNumber1(), numberOperations.getNumber2()));
        } else {
            nextOperation.calculate(numberOperations);
        }
    }

    @Override
    public void nextHandle(Operation operation) {
        this.nextOperation = operation;

    }

}

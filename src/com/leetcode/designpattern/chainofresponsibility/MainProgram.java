package com.leetcode.designpattern.chainofresponsibility;

public class MainProgram {

    public static void main(String[] ags) {

        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation divison = new Divison();

        addition.nextHandle(subtraction);
        subtraction.nextHandle(multiplication);
        multiplication.nextHandle(divison);

        NumberOperations numberOperations = new NumberOperations();
        numberOperations.setNumber1(120);
        numberOperations.setNumber2(12);
        numberOperations.setOperationType(OperationType.DIV);
        
        addition.calculate(numberOperations);
    }
}

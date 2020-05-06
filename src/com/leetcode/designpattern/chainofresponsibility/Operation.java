package com.leetcode.designpattern.chainofresponsibility;

public interface Operation {

    public void calculate(NumberOperations numberOperations);
    
    public void nextHandle(Operation operation);
}

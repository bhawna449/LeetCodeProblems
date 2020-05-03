package com.leetcode.solutions;

import java.util.Stack;

public class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(512);
        minStack.push(-1024);       
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        
    }

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {

        if (minStack.isEmpty()) {
            minStack.push(x);
        } else if (x <= minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {

        if (stack.isEmpty()) {
            System.out.println("Stack is  empty");
            
        } else if (stack.peek().intValue() == minStack.peek().intValue()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is  empty");
            return 0;
        }
        return stack.peek();
    }

    public int getMin() {

        if (minStack.isEmpty()) {
            System.out.println("Stack is  empty");
            return 0;
        }
        return minStack.peek();
    }
}

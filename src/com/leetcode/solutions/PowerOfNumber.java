/*
 * 
 */
package com.leetcode.solutions;

/**
 * @author bhawnajoshi
 *
 */
public class PowerOfNumber {

    public static void main(String[] args) {

        PowerOfNumber powerOfNumber = new PowerOfNumber();
        System.out.println(powerOfNumber.myPow(2, 4));
    }

    public double myPow(double x, int number) {
        if (number == 1 || x == 0)
            return x;
        if (number == 0 || x == 1) {
            return 1;
        }
        double value = number < 0 ? 1 / myPower(x, Math.abs(number)) : myPower(x, Math.abs(number));
        return value;

    }

    private double myPower(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return myPower(x * x, n / 2);
        } else {
            return x * myPower(x * x, n / 2);

        }

    }
}

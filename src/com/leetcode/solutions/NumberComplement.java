package com.leetcode.solutions;

public class NumberComplement {

    public static void main(String[] args) {

        System.out.println(NumberComplement.findComplement(1));
    }

    public static int findComplement(int num) {

        StringBuilder str = new StringBuilder();
        int pow = 0;
        int sum = 0;

        while (num > 0) {
            int rem = num % 2;
            str.append(rem == 0 ? 1 : 0);
            num /= 2;
        }

        for (int c : str.toString().toCharArray()) {

            sum += Math.pow(2, pow) * (c - 48);
            pow++;
        }

        return sum;

    }
}

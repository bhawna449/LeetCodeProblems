package com.leetcode.solutions;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(HappyNumber.happyNumber(27));
    }

    private static boolean happyNumber(int n) {
        int sum = n;
        HashSet<Integer> hashSet = new HashSet<>();
        while (!hashSet.contains(sum)) {
            hashSet.add(sum);
            sum = sum(sum);
            if (sum == 1) {
                return true;
            }
        }
        return false;
    }
    
    private static int sum(int number) {
        int sum =0;
        while (number != 0) {
            int mod = number %10;
            sum = sum + mod * mod;   
            number = number /10;
        }
        return sum;
        
    }
}

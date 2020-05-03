package com.leetcode.solutions;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] arr = { 4, 1, 2, 2, 1 };
        System.out.println(singleNumber.singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a,b) -> a ^ b );
    }
}

package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static void main(String[] args) {

        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int sum = 0;
        System.out.println(SubarraySum.subarraySum(arr, sum));
    }

    public static int subarraySum(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            hashMap.put(i, currentSum);

        }

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(i) == k) {
                count++;
            }
            for (int j = 0; j < i; j++) {
                if (hashMap.get(i) - hashMap.get(j) == k) {
                    count++;
                }
            }
        }

        return count;

    }
}

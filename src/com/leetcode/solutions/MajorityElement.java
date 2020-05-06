package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(MajorityElement.majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> keyValue = new HashMap<>();
        for (int n : nums) {
            if (keyValue.get(n) != null) {
                keyValue.computeIfPresent(n, (k, v) -> v + 1);
            } else {
                keyValue.put(n, 1);
            }
        }

        return keyValue.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue())).findFirst().get()
                .getKey();
    }
}
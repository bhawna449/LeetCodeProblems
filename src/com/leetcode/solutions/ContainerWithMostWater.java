package com.leetcode.solutions;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(ContainerWithMostWater.maxArea(height));
    }

    public static int maxArea(int[] height) {

        int maxVol = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int calc = Math.min(height[i], height[j]) * (j - i);
                if (calc > maxVol) {
                    maxVol = calc;
                }
            }
        }
        return maxVol;
    }
}

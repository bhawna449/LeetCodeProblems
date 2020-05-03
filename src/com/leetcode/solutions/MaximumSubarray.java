package com.leetcode.solutions;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray.maxArray(arr);
    }

    private static void maxArray(int[] nums) {

        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i <nums.length;i++) {
            sum = 0;
            for (int j = i ; j <nums.length;j++) {
                sum = sum + nums[j];
                if (maxSum < sum) {
                    maxSum = sum;
                } 
            }
            
        }
        System.out.println(maxSum);
    }
    
}

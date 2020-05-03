package com.leetcode.solutions;

public class ProductArray {

    public static void main(String[] args) {
        int[] arr = { 0, 0};
        ProductArray.productExceptSelf(arr);

    }

    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int[] prod = new int[length];
        int temp = 1;

        for (int i = 0; i < length; i++) {
            prod[i] = 1;
        }
        
        for (int i = 0; i < length; i++) {
            prod[i] = temp;
            temp = temp * nums[i];
        }

        temp = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            prod[i] = prod[i] * temp;
            temp = temp *  nums[i];
        }

        return prod;
    }

}

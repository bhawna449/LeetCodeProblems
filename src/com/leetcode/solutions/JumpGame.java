package com.leetcode.solutions;

public class JumpGame {

    public static void main(String[] args) {

        int[] arr = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(JumpGame.canJump(arr));
    }

    public static boolean canJump(int[] nums) {

        int index = 0;
        while (index < nums.length) {

            int val = nums[index];
            int maxIndex = findMaxIndex(nums, index, val);
            index = maxIndex + nums[maxIndex];
            if (index >= nums.length - 1) {
                return true;
            }
            if (nums[index] == 0) {
                return false;
            }

        }
        return false;

    }

    private static int findMaxIndex(int[] nums, int index, int val) {
        int maxIndex = 0;
        int maxNumber = 0;
        int l= index +val;

        for (int i = index; i <l; i++) {
            if (i >= nums.length) {
                return maxIndex;
            }
            if (nums[i] >= maxNumber) {
                maxIndex = i;
                maxNumber = nums[i];
            }
        }
        return maxIndex;
    }
}

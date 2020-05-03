package com.leetcode.solutions;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {1,3,5 };
        SearchRotatedSortedArray.search(nums, 1);
    }

    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums, nums.length - 1, 0);
        int pos = -1;
        if (pivot == -1) {
            pos = binarySearch(nums, 0, nums.length - 1, target);

        } else if (target == nums[pivot]) {
            pos = pivot;
        } else if (target >= nums[0] && target < nums[pivot]) {
            pos = binarySearch(nums, 0, pivot - 1, target);
        } else {
            pos = binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
        System.out.println(pivot);
        System.out.println(pos);
        return pos;

    }

    private static int binarySearch(int[] nums, int low, int high, int target) {

        if (high < low)
            return -1;

        int mid = (high + low) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        }
        return binarySearch(nums, low, mid - 1, target);

    }

    private static int findPivot(int[] nums, int high, int low) {
        if (low > high) {
            return -1;
        }

        if (high == low) {
            return low;
        }
        int mid = (high + low) / 2;
        if (mid < high && nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (mid > low && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        } else if (nums[low] >= nums[mid]) {
            return findPivot(nums, mid - 1, low);
        }
        return findPivot(nums, high, mid + 1);


    }
}

package com.leetcode.solutions;

public class FirstBadVersion {

    public static void main(String[] args) {
        Solution s = new Solution(2126753390);
        System.out.println(s.firstBadVersion(1702766719));
    }

}

class Solution extends VersionControl {
    public Solution(int n) {
        this.badversion= n;
    }

    public int firstBadVersion(int n) {
        if (isBadVersion(n)) {
            return 0;
        }
        return seachNumber(1, n);

    }

    private int seachNumber(int low, int high) {
        int mid = 0;
       while (low <= high) {
          mid = low + (high -low)/2;
           if (!isBadVersion(mid)) {
               low = mid+1;
           } else {
               high = mid -1;
           }
       }
          return low;
    }
}

class VersionControl {
    int badversion;

    boolean isBadVersion(int n) {
        if (n >= badversion)
            return true;
        return false;
    }
}

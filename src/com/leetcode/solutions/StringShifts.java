package com.leetcode.solutions;

import java.util.Arrays;

public class StringShifts {

    public static void main(String[] args) {

        int[][] arr = { { 1, 4 }, { 0, 7 }, { 0, 8 }, { 0, 7 }, { 0, 6 }, { 1, 3 }, { 0, 1 }, { 1, 7 }, { 0, 5 },
                { 0, 6 } };
        StringShifts.stringShift("xqgwkiqpif", arr);
    }

    public static String stringShift(String s, int[][] shift) {

        int totalShift = findTotalShift(shift, s.length());
        int strLength = s.length();
        if (totalShift == 0) {
            return s;
        } else if (totalShift > 0) {
            s = s.substring(strLength - totalShift, strLength).concat(s.substring(0, strLength - totalShift));

        } else {
            totalShift = Math.abs(totalShift);
            s = s.substring(totalShift, strLength).concat(s.substring(0, totalShift));
        }

        System.out.println(s);
        return s;
    }

    private static int findTotalShift(int[][] shift, int lenght) {
        int totalShift = 0;
        for (int[] s1 : shift) {
            switch (s1[0]) {
                case 0:
                    totalShift -= s1[1];
                    break;
                case 1:
                    totalShift += s1[1];
                    break;
            }

        }
        totalShift = Math.abs(totalShift) > lenght ? totalShift % lenght : totalShift;
        return totalShift;
    }
}

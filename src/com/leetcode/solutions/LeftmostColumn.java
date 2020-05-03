package com.leetcode.solutions;

import java.util.List;

public class LeftmostColumn {

    public static void main(String[] args) {
        int mat[][] = { { 0, 0 }, {0,1} };
        System.out.println(LeftmostColumn.leftMostColumnWithOne(mat));

    }

    public static int leftMostColumnWithOne(int[][] mat) {

        int value = mat[0].length -1;
        int row = mat.length;
        boolean found = false;
        for (int i = 0; i < row; i++) {

            for (int j = value ; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    break;
                } else if (mat[i][j] == 1 ) {
                    found = true;
                    value = j;
                }
                if (j == 0) {
                    return 0;
                }

            }
        }
        return found ? value: -1;

    }
}

// This is the BinaryMatrix's API interface.
// You should not implement it, or speculate about its implementation
interface BinaryMatrix {
    public int get(int x, int y);

    public List<Integer> dimensions();
}
package com.leetcode.solutions;

public class MinPathSum {

    public static void main(String[] args) {
        int grid[][] = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

        System.out.println(MinPathSum.minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {

        return Math.min(findSum(grid, 1, 0, grid[0][0]), findSum(grid, 0, 1, grid[0][0]));

    }

    private static int findSum(int[][] grid, int i, int j, int sum) {

        if ((i == grid.length && j == grid.length -1)   || (j == grid.length && i == grid.length -1)) {
            return sum;
        } else if (i == grid.length || j == grid.length ) {
            return Integer.MAX_VALUE;
        }

        sum = sum + grid[i][j];
        return Math.min(findSum(grid, i + 1, j, sum), findSum(grid, i, j + 1, sum));

    }
}

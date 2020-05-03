package com.leetcode.solutions;

public class NumberOfIslands {
    public static void main(String[] args) {
    
        char grid[][] = new char[][] { { 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 1 }, 
            { 1, 0, 0, 1, 1 }, 
            { 0, 0, 0, 0, 0 }, 
            { 1, 0, 1, 0, 1 } }; 
            System.out.println(NumberOfIslands.numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        
        int count = 0;
        for (int i =0; i < grid.length; i++) {
            
            for (int j =0; j < grid[0].length; j++) {
                
                if (grid[i][j] == 1) {
                    findIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;

    }

    private static void findIsland(char[][] grid, int i, int j) {
        
        if (i < 0 || j < 0 ||  i >= grid.length || j >= grid.length  || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2;
        findIsland(grid, i + 1, j);
        findIsland(grid, i - 1, j);
        findIsland(grid, i, j - 1);
        findIsland(grid, i, j + 1);
    }
}

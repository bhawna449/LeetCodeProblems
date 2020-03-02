package com.leetcode.solutions;

public class MatrixRotation {

    public static void main(String args[]) {

        int matrix[][] = 
            { 
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8 ,9}
            }; 
        
        MatrixRotation matrixRotation = new MatrixRotation();
        matrixRotation.display(matrix);
        matrixRotation.rotate(matrix);
        matrixRotation.display(matrix);
    }

    private int[][] rotate(int[][] matrix) {

        int size = matrix.length;

        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - j -1][i];
                matrix[size - j -1][i] = matrix[size - 1 - i][size - j - 1];
                matrix[size - 1 - i][size - j - 1] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = temp;
            }

        }
        return matrix;
    }

    private void display(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

}

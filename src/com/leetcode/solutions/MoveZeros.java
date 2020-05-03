package com.leetcode.solutions;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 3, 12 };
        MoveZeros.move(arr);
    }

    private static void move(int[] arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            } 
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
       
    }

}

package com.leetcode.solutions;

public class JewelsStones {

    public static void main(String[] args) {
        JewelsStones.numJewelsInStones("aA", "aAAbbbb");
    }
    
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c : S.toCharArray()) {
            if (J.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    } 


}

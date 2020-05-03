package com.leetcode.solutions;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        System.out.println(BackspaceStringCompare.backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String S, String T) {

          return removeBackspace(S).equals(removeBackspace(T));
         
    }
    
    private static String removeBackspace(String s) {
        int hashcounter = 0;
        StringBuilder backSpaceRemovedStr = new StringBuilder();
       
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                hashcounter++;
            } else if (hashcounter == 0) {
                backSpaceRemovedStr.append(s.charAt(i));
            } else {
                hashcounter--;
            }
        }
        return backSpaceRemovedStr.toString();
    }

}

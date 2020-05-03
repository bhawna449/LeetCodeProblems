package com.leetcode.solutions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestPalindrome {

    public static void main(String[] args) {

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(
                "baba"));
    }

    private String longestPalindrome(String str) {
        String maxPalindrome = longestPalindrome(str.toCharArray(), 0, str.length(), "", "");
        return maxPalindrome;
    }

    private String longestPalindrome(char[] cs, int start, int end, String result, String maxPallindrome) {
        if (result.equals(reverse(result)) && result.length() > maxPallindrome.length()) {
            maxPallindrome = result;
        }
        
      
        for (int i = start; i < end; i++) {
            System.out.println(result.concat(String.valueOf(cs[i])));
            longestPalindrome(cs,i +1 ,  end , result.concat(String.valueOf(cs[i])),  maxPallindrome);
        }
        result = new String();
        return maxPallindrome;
    }

    public static String reverse(String string) {
        return Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
    }
}

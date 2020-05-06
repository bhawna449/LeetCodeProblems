package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(FirstUniqueCharacter.firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (hashMap.get(c) != null) {
                hashMap.computeIfPresent(c, (k, v) -> v + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}

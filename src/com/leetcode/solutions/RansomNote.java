package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(RansomNote.canConstruct("aa", "ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> magzineElementMap = new HashMap<>();
        magazine.chars().mapToObj(c -> Character.valueOf((char) c)).forEach(c -> {
            if (magzineElementMap.containsKey(c)) {
                magzineElementMap.computeIfPresent(c, (k, v) -> v + 1);
            } else {
                magzineElementMap.put(c, 1);
            }
        });
        
        for (char c: ransomNote.toCharArray()) {
            if (magzineElementMap.containsKey(c) && magzineElementMap.get(c) != 0 ) {
                magzineElementMap.computeIfPresent(c, (k, v) -> v - 1);
            } else {
                return false;
            }
            
            
        }
  
           
        return true;
    }
}

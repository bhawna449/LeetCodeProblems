package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams.groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> output = new LinkedList<List<String>>();
        if (strs.length == 0) return output;
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String keyStr = String.valueOf(chars);
            if (!map.containsKey(keyStr)) map.put(keyStr, new LinkedList<String>());
            map.get(keyStr).add(str);
        }
        
        return new ArrayList<>(map.values());
       

    }
    
    private static String sortString(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}

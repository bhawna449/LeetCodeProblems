package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LetterCombinarionPhoneNumber {
    Map<Integer, String> phoneCombination = new HashMap<>();

    public static void main(String args[]) {
        LetterCombinarionPhoneNumber soution = new LetterCombinarionPhoneNumber();
        soution.letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<>();
        getPhoneCombination();

        if (digits.isEmpty() ) {
            return letters;
        }
        List<Integer> listOfDigits = getNumList(Integer.parseInt(digits));
        for (Integer val : listOfDigits) {
            if (letters.isEmpty()) {
                for (char c:  phoneCombination.get(val).toCharArray()) {
                    letters.add(String.valueOf(c));
                }
            } else {
                char[] chrArr = phoneCombination.get(val).toCharArray();
                List<String> temp = new ArrayList<>(letters);
                letters.clear();
                for (Character c : chrArr) {
                    for (String s : temp) {
                        letters.add(s.concat(String.valueOf(c)));
                    }
                }
            }

        }
        letters.forEach(s -> System.out.println(s));
        return letters;

    }

    private void getPhoneCombination() {
        phoneCombination.put(2, "abc");
        phoneCombination.put(3, "def");
        phoneCombination.put(4, "ghi");
        phoneCombination.put(5, "jkl");
        phoneCombination.put(6, "mno");
        phoneCombination.put(7, "pqrs");
        phoneCombination.put(8, "tuv");
        phoneCombination.put(9, "wxyz");
    }

    private List<Integer> getNumList(int num) {
        List<Integer> listNum = new ArrayList<>();
        while (num > 0) {
            listNum.add(num / 10);
            num = num / 10;
        }
         Collections.reverse(listNum);
        return listNum;

    }
}

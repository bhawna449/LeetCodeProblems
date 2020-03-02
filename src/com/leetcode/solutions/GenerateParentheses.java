package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {

        addValidParenthesis(2);
    }

    private static List<String> addValidParenthesis(int n) {
        List<String> paranList = new ArrayList<>();
        addValidParenthesis(n, n, "", paranList);
        return paranList;

    }

    private static void addValidParenthesis(int open, int close, String str, List<String> paranList) {

        if (open == 0 && close == 0) {
            paranList.add(str);
        }
        if (open > close) {
            return;
        }
        if (open > 0) {
            addValidParenthesis(open - 1, close, str.concat("("), paranList);
        }
        if (close > 0) {
            addValidParenthesis(open, close - 1, str.concat(")"), paranList);
        }
    }
}

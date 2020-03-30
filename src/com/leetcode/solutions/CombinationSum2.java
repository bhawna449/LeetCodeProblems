package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        CombinationSum2 combinationSum = new CombinationSum2();
        int[] arr = { 1, 1, 2, 5, 6, 7, 10 };
        combinationSum.combinationSum(arr, 8).forEach(s -> System.out.println(s));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> temList = new ArrayList<>();
        combinationSum(0, candidates.length, 0, temList, resultList, target, candidates);

        return resultList;

    }

    private void combinationSum(int start, int end, int sum, List<Integer> result, List<List<Integer>> resultList,
            int target, int[] candidates) {

        if (sum == target) {
            if (!resultList.contains(result)) {
                resultList.add(new ArrayList<>(result));
            }
        }

        if (sum > target)
            return;
        for (int i = start; i < end; i++) {
            result.add(candidates[i]);
            combinationSum(i + 1, end, sum + candidates[i], result, resultList, target, candidates);
            result.remove(result.size() - 1);
        }
    }
}

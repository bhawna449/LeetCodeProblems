package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int [] arr= {2,3,5};
        combinationSum.combinationSum(arr,8 ).forEach(s -> System.out.println(s));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> temList = new ArrayList<>();
        combinationSum(0, candidates.length, 0, temList, resultList, target, candidates);
        
        return resultList;
        
    }

    private void combinationSum(int start, int end, int sum, List<Integer> result, List<List<Integer>> resultList, int target, int[] candidates) {

        if (sum == target) {
            resultList.add(new ArrayList<>(result));
        }
        
        if (sum > target)
            return;
        for (int i = start; i< end; i++) {
            result.add(candidates[i]);
            combinationSum(i, end, sum + candidates[i], result, resultList, target, candidates);
            result.remove(result.size() -1);
        }
    }
}

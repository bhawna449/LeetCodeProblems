package com.leetcode.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingElements {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2};
        CountingElements.countElements(arr);
    }

  public static int countElements(int[] arr) {
     
      AtomicInteger count = new AtomicInteger(0);
      Set<Integer> uniqueSet = new HashSet<>();
      Arrays.stream(arr).forEach(val -> {
          if (!uniqueSet.contains(val)) {
              uniqueSet.add(val);
          }
      });
      
      Arrays.stream(arr).forEach(val -> {
          if (uniqueSet.contains(Integer.valueOf(val) + 1)) {
              count.incrementAndGet();
          }
      });
      
    return count.get();
        
    }
}

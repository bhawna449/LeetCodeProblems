package com.leetcode.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(LastStoneWeight.lastStoneWeight1(arr));
    }

  

    public static int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((i1, i2) -> i2-i1);
        for (int i : stones) {
            priorityQueue.offer(i);
        }
        while (priorityQueue.size() > 1) {
            priorityQueue.offer(priorityQueue.poll() - priorityQueue.poll());
        }
        return priorityQueue.poll();
        
    }
}

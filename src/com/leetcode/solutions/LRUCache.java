package com.leetcode.solutions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, Integer> elements = new HashMap<>();
    Map<Integer, Integer> priorityMap = new HashMap<>();
    int capacity;

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */ );
        System.out.println(cache.get(2)); // returns 1
        cache.put(2, 6);
        System.out.println(cache.get(1)); // returns 1
        cache.put(1, 5);
        cache.put(1, 2); // evicts key 2
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (elements.get(key) != null) {
            priorityMap.put(key, Collections.max(priorityMap.values()) + 1);
            return elements.get(key);
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {

        if (!elements.containsKey(key) && this.capacity == elements.size()) {
            int k = Collections.min(priorityMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            elements.remove(k);
            priorityMap.remove(k);
        }
        elements.put(key, value);
        priorityMap.put(key, priorityMap.size() == 0 ? 1 : Collections.max(priorityMap.values()) + 1);

    }

}

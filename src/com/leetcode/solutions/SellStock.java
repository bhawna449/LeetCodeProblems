package com.leetcode.solutions;

public class SellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        SellStock.sell(prices);
    }

    private static int sell(int[] prices) {
        int profit = 0;
        for (int i =1; i< prices.length;i++) {
            if (prices[i] - prices[i -1] > 0) {
                profit+=prices[i] - prices[i -1];
            }
        }
        return profit;
    }

}

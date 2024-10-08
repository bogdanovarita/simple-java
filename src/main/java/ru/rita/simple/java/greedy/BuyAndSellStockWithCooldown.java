package ru.rita.simple.java.greedy;

/*
309. Best Time to Buy and Sell Stock with Cooldown (Medium)
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
https://algo.monster/liteproblems/309

You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve.
You may complete as many transactions as you like
(i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

Example 1:

Input: prices = [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]

Example 2:

Input: prices = [1]
Output: 0
 */
public class BuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        // Initialize the profit states:
        // f0: the max profit we can have at this state if we don't hold a stock
        // f1: the max profit we can have at this state if we hold one stock
        // holdProfit: stores the previous f0 state to calculate the new f1 state
        int sellStockProfit = 0;
        int holdProfit = 0;
        int buyStockProfit = -prices[0]; // Assume we bought the first stock

        // Loop through the list of prices starting from the second price
        for (int i = 1; i < prices.length; ++i) {
            // Calculate the max profit if we don't hold a stock today
            // either we did not hold a stock yesterday (noStockProfit) or
            // we sold the stock we were holding (oneStockProfit + prices[i]).
            int newSellStockProfit = Math.max(sellStockProfit, buyStockProfit + prices[i]);

            // Calculate the max profit if we hold one stock today
            // either we were already holding a stock (oneStockProfit) or
            // we buy a new stock today (holdProfit - prices[i]).
            buyStockProfit = Math.max(buyStockProfit, holdProfit - prices[i]);

            // Update holdProfit to the previous sellStockProfit at the end of the day
            holdProfit = sellStockProfit;
            // Update noStockProfit to the new calculated noStockProfit
            sellStockProfit = newSellStockProfit;
        }
        // Since we want to maximize profit, we should not hold any stock at the end
        // hence we return noStockProfit which represents the max profit with no stock in hand
        return sellStockProfit;
    }
}

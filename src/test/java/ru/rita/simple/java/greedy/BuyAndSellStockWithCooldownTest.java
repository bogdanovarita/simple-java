package ru.rita.simple.java.greedy;

import junit.framework.TestCase;

public class BuyAndSellStockWithCooldownTest extends TestCase {

    public void testMaxProfit_whenOnlyOneElem_thenZero() {
        BuyAndSellStockWithCooldown testClass = new BuyAndSellStockWithCooldown();
        int[] testData = new int[]{1};
        assertEquals(0, testClass.maxProfit(testData));
    }

    public void testMaxProfit_whenCase1_thenThree() {
        BuyAndSellStockWithCooldown testClass = new BuyAndSellStockWithCooldown();
        int[] testData = new int[]{1, 2, 3, 0, 2};
        assertEquals(3, testClass.maxProfit(testData));
    }
}
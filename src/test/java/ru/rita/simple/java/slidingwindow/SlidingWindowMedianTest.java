package ru.rita.simple.java.slidingwindow;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowMedianTest extends TestCase {

    public void testMedianSlidingWindow_whenKIsEven() {
        SlidingWindowMedian testClass = new SlidingWindowMedian();
        int[] testDataNums = new int[]{1,3,-1,-3,5,3,6,7};
        int testDataK = 3;
        double[] expected = new double[]{1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000};
        assertArrayEquals(expected, testClass.medianSlidingWindow(testDataNums, testDataK), 0.0);
    }

    public void testMedianSlidingWindow_whenKIsEven_Second() {
        SlidingWindowMedian testClass = new SlidingWindowMedian();
        int[] testDataNums = new int[]{1,2,3,4,2,3,1,4,2};
        int testDataK = 3;
        double[] expected = new double[]{2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000};
        assertArrayEquals(expected, testClass.medianSlidingWindow(testDataNums, testDataK), 0.0);
    }
}
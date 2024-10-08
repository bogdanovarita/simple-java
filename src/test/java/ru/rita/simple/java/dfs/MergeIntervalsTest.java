package ru.rita.simple.java.dfs;

import junit.framework.TestCase;

import java.util.Arrays;

public class MergeIntervalsTest extends TestCase {

    public void testMerge_whenArrayNull_thenExpectEmpty() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{}, testClass.merge(null)));
    }

    public void testMerge_whenArrayEmpty_thenExpectEmpty() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{}, testClass.merge(new int[][]{})));
    }

    public void testMerge_whenSomeOverlaps_thenExpectThreeIntervals() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                testClass.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    public void testMerge_whenTwoSideBySideIntervals_thenExpectOneInterval() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{{1, 5}},
                testClass.merge(new int[][]{{1, 4}, {4, 5}})));
    }

    public void testMerge_whenOneIntervalInOther_thenExpectOneInterval() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{{1, 4}},
                testClass.merge(new int[][]{{1, 4}, {2, 3}})));
    }

    public void testMerge_whenManyIntervalsInOther_thenExpectOneInterval() {
        MergeIntervals testClass = new MergeIntervals();
        assertTrue(Arrays.deepEquals(new int[][]{{1, 3}, {4, 7}},
                testClass.merge(new int[][]{{2, 3}, {2, 2}, {3, 3},
                        {1, 3}, {5, 7}, {2, 2}, {4, 6}})));
    }
}
package ru.rita.simple.java.hashtable;

import junit.framework.TestCase;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest extends TestCase {

    public void testTwoSum_when_four_elems() {
        TwoSum searcher = new TwoSum();
        int[] result = searcher.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected = new int[]{0, 1};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    public void testTwoSum_when_three_elems() {
        TwoSum searcher = new TwoSum();
        int[] result = searcher.twoSum(new int[]{3, 2, 4}, 6);
        int[] expected = new int[]{1, 2};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    public void testTwoSum_when_two_elems_duplicates() {
        TwoSum searcher = new TwoSum();
        int[] result = searcher.twoSum(new int[]{3, 3}, 6);
        int[] expected = new int[]{0, 1};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    public void testTwoSum_when_two_different_elems() {
        TwoSum searcher = new TwoSum();
        int[] result = searcher.twoSum(new int[]{3, 2}, 5);
        int[] expected = new int[]{0, 1};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
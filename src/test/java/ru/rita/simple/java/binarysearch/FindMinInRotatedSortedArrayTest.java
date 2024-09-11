package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class FindMinInRotatedSortedArrayTest extends TestCase {

    public void testFindMin_when_one_elem() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{2});
        int expected = 2;
        assertEquals(expected, result);
    }

    public void testFindMin_when_rotated_one_time() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{8, 0, 1, 2, 3, 4, 5, 6, 7});
        int expected = 0;
        assertEquals(expected, result);
    }

    public void testFindMin_when_rotated_n_1_times() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0});
        int expected = 0;
        assertEquals(expected, result);
    }

    public void testFindMin_when_rotated_3_times() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{3, 4, 5, 1, 2});
        int expected = 1;
        assertEquals(expected, result);
    }

    public void testFindMin_when_rotated_4_times() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        int expected = 0;
        assertEquals(expected, result);
    }

    public void testFindMin_when_rotated_n_times() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{11, 13, 15, 17});
        int expected = 11;
        assertEquals(expected, result);
    }

    public void testFindMin_when_min_in_the_middle() {
        FindMinInRotatedSortedArray finder = new FindMinInRotatedSortedArray();
        int result = finder.findMin(new int[]{5, 6, 7, 8, 0, 1, 2, 3, 4});
        int expected = 0;
        assertEquals(expected, result);
    }
}
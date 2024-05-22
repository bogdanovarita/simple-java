package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class BinarySearchTest extends TestCase {

    public void testSearch_when_empty_array() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{};
        assertEquals(-1, searcher.search(input, 0));
    }

    public void testSearch_when_target_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(4, searcher.search(input, 9));
    }

    public void testSearch_when_target_not_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(-1, searcher.search(input, 2));
    }

    public void testSearch_when_target_not_exists_odd_values() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{-1, 0, 3, 5, 9};
        assertEquals(-1, searcher.search(input, 2));
    }

    public void testSearch_when_target_exists_odd_values() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{-1, 0, 3, 5, 9};
        assertEquals(3, searcher.search(input, 5));
    }

    public void testSearch_when_one_elem_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5};
        assertEquals(0, searcher.search(input, 5));
    }

    public void testSearch_when_one_elem_not_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5};
        assertEquals(-1, searcher.search(input, 6));
    }

    public void testSearch_when_two_elem_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5, 6};
        assertEquals(0, searcher.search(input, 5));
    }

    public void testSearch_when_two_elem_exists_1() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{4, 5};
        assertEquals(1, searcher.search(input, 5));
    }

    public void testSearch_when_two_elem_not_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5, 7};
        assertEquals(-1, searcher.search(input, 6));
    }

    public void testSearch_when_three_elem_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5, 6, 7};
        assertEquals(0, searcher.search(input, 5));
    }

    public void testSearch_when_three_elem_exists_1() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{4, 5, 6};
        assertEquals(1, searcher.search(input, 5));
    }

    public void testSearch_when_three_elem_exists_2() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{1, 4, 5};
        assertEquals(2, searcher.search(input, 5));
    }

    public void testSearch_when_three_elem_not_exists() {
        BinarySearch searcher = new BinarySearch();
        int[] input = new int[]{5, 7, 8};
        assertEquals(-1, searcher.search(input, 6));
    }
}
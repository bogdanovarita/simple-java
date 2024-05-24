package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class SearchInRotatedSortedArrayTest extends TestCase {

    public void testSearch_when_k_greater_middle_and_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        int expected = 4;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_greater_middle_and_not_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        int expected = -1;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_less_middle_and_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 0);
        int expected = 2;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_one_and_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{1, 2, 4, 5, 6, 7, 0}, 0);
        int expected = 6;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_less_middle_and_not_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 3);
        int expected = -1;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 2);
        int expected = 2;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_exists_in_the_beginning() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 0);
        int expected = 0;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_not_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 3);
        int expected = -1;
        assertEquals(expected, result);
    }

    public void testSearch_when_one_elem_and_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{1}, 1);
        int expected = 0;
        assertEquals(expected, result);
    }

    public void testSearch_when_one_elem_and_not_exists() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{1}, 3);
        int expected = -1;
        assertEquals(expected, result);
    }

    public void testSearch_when_three_elem_and_exists_last() {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int result = searcher.search(new int[]{5, 1, 3}, 3);
        int expected = 2;
        assertEquals(expected, result);
    }
}
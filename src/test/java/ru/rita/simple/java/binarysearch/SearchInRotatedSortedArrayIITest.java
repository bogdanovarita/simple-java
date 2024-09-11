package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class SearchInRotatedSortedArrayIITest extends TestCase {

    public void testSearch_when_k_greater_middle_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_greater_middle_and_not_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_less_middle_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_one_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1, 2, 4, 5, 6, 7, 0}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_less_middle_and_not_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 3);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 2);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_exists_in_the_beginning() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_k_equals_zero_and_not_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 3);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearch_when_one_elem_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1}, 1);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_one_elem_and_not_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1}, 3);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearch_when_two_same_elems_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1, 1}, 1);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_three_elem_and_exists_last() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{5, 1, 3}, 3);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_three_elem_and_exists_last_with_duplicates() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{5, 1, 3, 3}, 3);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_three_elem_and_exists_last_with_in_different_parts() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{3, 5, 1, 3, 3}, 3);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_seven_elem_and_exists_with_duplicates() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_seven_elem_and_not_exists_with_duplicates() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearch_when_all_duplicates_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1, 0, 1, 1, 1}, 0);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearch_when_all_many_duplicates_and_exists() {
        SearchInRotatedSortedArrayII searcher = new SearchInRotatedSortedArrayII();
        boolean result = searcher.search(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1}, 2);
        boolean expected = true;
        assertEquals(expected, result);
    }
}
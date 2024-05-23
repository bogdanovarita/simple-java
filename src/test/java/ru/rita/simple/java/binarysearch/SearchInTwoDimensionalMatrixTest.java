package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class SearchInTwoDimensionalMatrixTest extends TestCase {

    public void testSearchMatrix_when_number_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchMatrix(input, 3);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_number_not_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchMatrix(input, 13);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_one_row_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 3, 5, 7}};
        boolean result = searcher.searchMatrix(input, 3);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_one_row_not_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 3, 5, 7}};
        boolean result = searcher.searchMatrix(input, 10);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_one_number_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1}};
        boolean result = searcher.searchMatrix(input, 1);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_one_number_not_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1}};
        boolean result = searcher.searchMatrix(input, 2);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_two_numbers_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 4}};
        boolean result = searcher.searchMatrix(input, 4);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_two_numbers_not_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 5}};
        boolean result = searcher.searchMatrix(input, 4);
        boolean expected = false;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_two_dimensions_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 4}, {5, 8}};
        boolean result = searcher.searchMatrix(input, 5);
        boolean expected = true;
        assertEquals(expected, result);
    }

    public void testSearchMatrix_when_two_dimensions_not_exists() {
        SearchInTwoDimensionalMatrix searcher = new SearchInTwoDimensionalMatrix();
        int[][] input = new int[][]{{1, 5}, {7, 9}};
        boolean result = searcher.searchMatrix(input, 2);
        boolean expected = false;
        assertEquals(expected, result);
    }
}
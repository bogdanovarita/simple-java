package ru.rita.simple.java.dfs;

import junit.framework.TestCase;

public class NumberOfIslandsStackTest extends TestCase {
    public void testNumIslands_whenGivenOneIreland_thanExpectOne() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenThreeIrelands_thanExpectThree() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenNullArray_thanExpectZero() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = null;
        assertEquals(0, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenEmptyArray_thanExpectZero() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{};
        assertEquals(0, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenOneStringArrayAndOneIreland_thanExpectOne() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '0', '0'}
        };
        assertEquals(1, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenOneStringArrayAndTwoIrelands_thanExpectTwo() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '1', '0'}
        };
        assertEquals(2, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenTwoIrelands_thanExpectTwo() {
        NumberOfIslandsStack testClass = new NumberOfIslandsStack();
        char[][] inputData = new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}
        };
        assertEquals(1, testClass.numIslands(inputData));
    }
}
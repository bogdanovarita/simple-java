package ru.rita.simple.java.dfs;

import junit.framework.TestCase;

public class NumberOfIslandsTest extends TestCase {

    public void testNumIslands_whenGivenOneIreland_thanExpectOne() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenThreeIrelands_thanExpectThree() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenNullArray_thanExpectZero() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = null;
        assertEquals(0, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenGivenEmptyArray_thanExpectZero() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = new char[][]{};
        assertEquals(0, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenOneStringArrayAndOneIreland_thanExpectOne() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '0', '0'}
        };
        assertEquals(1, testClass.numIslands(inputData));
    }

    public void testNumIslands_whenOneStringArrayAndTwoIrelands_thanExpectTwo() {
        NumberOfIslandsRecursion testClass = new NumberOfIslandsRecursion();
        char[][] inputData = new char[][]{
                {'1', '1', '0', '1', '0'}
        };
        assertEquals(2, testClass.numIslands(inputData));
    }
}
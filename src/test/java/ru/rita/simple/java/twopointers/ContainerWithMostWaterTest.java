package ru.rita.simple.java.twopointers;

import junit.framework.TestCase;
import static org.junit.Assert.assertThrows;

public class ContainerWithMostWaterTest extends TestCase {

    public void testMaxArea_whenNotEmptyArray_thenMaxSecondAndLastPoint() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, testClass.maxArea(testData));
    }

    public void testMaxArea_whenOnlyTwoElems_thenReturnSquareOfThisArea() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{1, 1};
        int expected = 1;
        assertEquals(expected, testClass.maxArea(testData));
    }

    public void testMaxArea_whenOnlyTwoElemsAndOneLess_thenReturnSquareOfSmallestArea() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{1, 3};
        int expected = 1;
        assertEquals(expected, testClass.maxArea(testData));
    }

    public void testMaxArea_whenElemsZero_thenReturnZeroArea() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{0, 0};
        int expected = 0;
        assertEquals(expected, testClass.maxArea(testData));
    }

    public void testMaxArea_whenContainsZero_thenReturnSquareOfSmallestArea() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{1, 0, 3};
        int expected = 2;
        assertEquals(expected, testClass.maxArea(testData));
    }

    public void testMaxArea_whenArrayNull_thenExpectException() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = null;
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> testClass.maxArea(testData));

        assertEquals("Array must not be null or empty", thrown.getMessage());
    }

    public void testMaxArea_whenArrayEmpty_thenExpectException() {
        ContainerWithMostWater testClass = new ContainerWithMostWater();
        int[] testData = new int[]{};
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> testClass.maxArea(testData));

        assertEquals("Array must not be null or empty", thrown.getMessage());
    }

}
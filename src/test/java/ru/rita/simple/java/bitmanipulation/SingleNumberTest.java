package ru.rita.simple.java.bitmanipulation;

import junit.framework.TestCase;

public class SingleNumberTest extends TestCase {

    public void testSingleNumber_when_array_decreasing() {
        SingleNumber finder = new SingleNumber();
        int result = finder.singleNumber(new int[]{2, 2, 1});
        int expected = 1;
        assertEquals(expected, result);
    }

    public void testSingleNumber_when_array_not_ordered() {
        SingleNumber finder = new SingleNumber();
        int result = finder.singleNumber(new int[]{4, 1, 2, 1, 2});
        int expected = 4;
        assertEquals(expected, result);
    }

    public void testSingleNumber_when_one_elem() {
        SingleNumber finder = new SingleNumber();
        int result = finder.singleNumber(new int[]{1});
        int expected = 1;
        assertEquals(expected, result);
    }
}
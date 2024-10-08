package ru.rita.simple.java.queue;

import junit.framework.TestCase;

public class ValidParenthesesTest extends TestCase {

    public void testIsValid_whenSimpleString_thanValidResult() {
        ValidParentheses testClass = new ValidParentheses();
        var inputData = "()";
        assertTrue(testClass.isValid(inputData));
    }

    public void testIsValid_whenSimpleString_thanNotValidResult() {
        ValidParentheses testClass = new ValidParentheses();
        var inputData = "(]";
        assertFalse(testClass.isValid(inputData));
    }

    public void testIsValid_whenStringWithAllBracketTypes_thanValidResult() {
        ValidParentheses testClass = new ValidParentheses();
        var inputData = "()[]{}";
        assertTrue(testClass.isValid(inputData));
    }

    public void testIsValid_whenStringWithBacketInBracket_thanValidResult() {
        ValidParentheses testClass = new ValidParentheses();
        var inputData = "([])";
        assertTrue(testClass.isValid(inputData));
    }
}
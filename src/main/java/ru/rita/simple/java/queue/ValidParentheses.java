package ru.rita.simple.java.queue;

import java.util.ArrayDeque;

/*
20. Valid Parentheses (Easy)
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"

Output: true

Example 2:
Input: s = "()[]{}"

Output: true

Example 3:
Input: s = "(]"

Output: false

Example 4:
Input: s = "([])"

Output: true

 */
public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int index = 0; index < s.length(); index++) {
            var current = s.charAt(index);
            if (current == '(' || current == '[' ||
                    current == '{') {
                stack.add(current);
            } else {
                Character lastElem = stack.pollLast();
                if (lastElem == null) {
                    return false;
                }
                if (!
                        ((lastElem == '(' && current == ')') ||
                                (lastElem == '{' && current == '}') ||
                                (lastElem == '[' && current == ']'))
                ) {
                    return false;
                }
                }
            }
            return stack.isEmpty();
        }
    }

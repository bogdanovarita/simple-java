package ru.rita.simple.java.hashtable;

import java.util.HashMap;
import java.util.Map;

/*
242. Valid Anagram (Easy)
https://leetcode.com/problems/valid-anagram/description/

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different
word or phrase, using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

Constraints:

1 <= s.length, t.length <= 5 * 10^4
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters?
How would you adapt your solution to such a case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        s.chars().forEach(current -> countMap.put(current, countMap.getOrDefault(current, 0) + 1));

        t.chars().forEach(current -> countMap.put(current, countMap.getOrDefault(current, 0) - 1));

        for (Integer value : countMap.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}

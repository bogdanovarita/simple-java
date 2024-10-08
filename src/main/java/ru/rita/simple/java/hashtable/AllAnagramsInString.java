package ru.rita.simple.java.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
438. Find All Anagrams in a String (Medium)
https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

Given two strings s and p, return an array of all the start indices of p's anagrams in s.
You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


Constraints:

1 <= s.length, p.length <= 3 * 10^4
s and p consist of lowercase English letters.
 */
public class AllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.isEmpty() || p.isEmpty()) {
            return result;
        }

        if (s.length() < p.length()) {
            return result;
        }
        var pWindow = new int[26];
        var sWindow = new int[26];

        for (int index = 0; index < p.length(); index++) {
            pWindow[p.charAt(index) - 'a']++;
            sWindow[s.charAt(index) - 'a']++;
        }

        if (Arrays.equals(pWindow, sWindow)) {
            result.add(0);
        }

        int leftIndex = 0;
        int rightIndex = p.length();
        while (rightIndex < s.length()) {
            sWindow[s.charAt(rightIndex) - 'a']++;
            rightIndex++;
            sWindow[s.charAt(leftIndex) - 'a']--;
            leftIndex++;

            if (Arrays.equals(pWindow, sWindow)) {
                result.add(leftIndex);
            }
        }
        return result;
    }


}

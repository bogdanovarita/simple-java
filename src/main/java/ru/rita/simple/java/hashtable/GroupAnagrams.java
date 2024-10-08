package ru.rita.simple.java.hashtable;

import java.util.*;

/*
49. Group Anagrams (Medium)
https://leetcode.com/problems/group-anagrams/description/

Given an array of strings strs, group the
anagrams
 together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]



Constraints:

1 <= strs.length <= 10^4
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String current : strs) {

            char[] key = new char[26];
            current.chars().forEach(charValue -> key[charValue - 'a']++);

            var keyString = new String(key);
            if (!result.containsKey(keyString)){
                result.put(keyString, new ArrayList<>());
            }
            result.get(keyString).add(current);
        }
        return new ArrayList<>(result.values());
    }
}

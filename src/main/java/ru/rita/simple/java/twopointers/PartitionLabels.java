package ru.rita.simple.java.twopointers;

import java.util.ArrayList;
import java.util.List;

/*
763. Partition Labels
You are given a string s. We want to partition the string into as many parts as possible
so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.

Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
Example 2:

Input: s = "eccbbbbdec"
Output: [10]


Constraints:

1 <= s.length <= 500
s consists of lowercase English letters.
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if (s == null || s.isEmpty()) {
            throw new RuntimeException("String must not be null or empty.");
        }
        List<Integer> result = new ArrayList<>();
        int[] lastPosition = new int[26];

        for (int index = 0; index < s.length(); index++) {
            lastPosition[s.charAt(index) - 'a'] = index;
        }

        int beginPartition = 0;
        int endPartition = 0;
        for (int index = 0; index < s.length(); index++) {
            endPartition = Math.max(endPartition, lastPosition[s.charAt(index) - 'a']);
            if (index == endPartition) {
                result.add(endPartition - beginPartition + 1);
                beginPartition = endPartition + 1;
            }
        }
        return result;
    }
}

package ru.rita.simple.java.dfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

/*
56. Merge Intervals (Medium)

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Constraints:

1 <= intervals.length <= 10^4
intervals[i].length == 2
0 <= starti <= endi <= 10^4
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] result = new int[][]{};

        if (intervals == null || intervals.length == 0) {
            return result;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        Deque<int[]> stack = new ArrayDeque<>();
        for (int[] interval : intervals) {
            int[] current = stack.peekLast();
            if (current == null || current[1] < interval[0]) {
                stack.add(interval);
            } else if (current[1] < interval[1]) {
                current = stack.pollLast();
                stack.addLast(new int[]{current[0], interval[1]});
            }
        }
        return stack.toArray(new int[stack.size()][]);
    }
}

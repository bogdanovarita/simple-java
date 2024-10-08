package ru.rita.simple.java.heaphash;

import java.util.*;

/*
347. Top K Frequent Elements

Given an integer array nums and an integer k,
 return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.


Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) {
            throw new RuntimeException("We expect not empty array and k > 0.");
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> countMap.put(num, countMap.getOrDefault(num, 0) + 1));

        Queue<Integer> queue = new PriorityQueue<>((val1, val2) -> {
            if (Objects.equals(countMap.get(val1), countMap.get(val2))) {
                return val2 - val1;
            } else {
                return countMap.get(val1) - countMap.get(val2);
            }
        });

        countMap.keySet().forEach(key -> {
            queue.add(key);
            if (queue.size() > k) {
                queue.poll();
            }
        });

        int[] result = new int[k];
        int index = k - 1;
        while (!queue.isEmpty()) {
            result[index] = queue.poll();
            index--;
        }
        return result;
    }
}

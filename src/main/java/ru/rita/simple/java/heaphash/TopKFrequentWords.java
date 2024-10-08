package ru.rita.simple.java.heaphash;

import java.util.*;

/*
692. Top K Frequent Words (Medium)
https://leetcode.com/problems/top-k-frequent-words/description/

Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest.
Sort the words with the same frequency by their lexicographical order.

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.

Constraints:

1 <= words.length <= 500
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i]]

Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space?
 */
public class TopKFrequentWords {
    private class Pair {
        String word;
        Integer count;

        public Pair(String word, Integer count) {
            this.count = count;
            this.word = word;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> topKQueue = new PriorityQueue<>((v1, v2) -> {
            if (v1.count.equals(v2.count)) {
                return v2.word.compareTo(v1.word);
            } else {
                return v1.count.compareTo(v2.count);
            }
        });

        for (String value : frequencyMap.keySet()) {
            topKQueue.add(new Pair(value, frequencyMap.get(value)));
            if (topKQueue.size() > k) {
                topKQueue.poll();
            }
        }

        String[] result = new String[k];

        var index = k - 1;
        while (!topKQueue.isEmpty()) {
            result[index] = topKQueue.poll().word;
            index--;
        }
        return Arrays.stream(result).toList();
    }
}

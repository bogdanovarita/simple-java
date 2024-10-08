package ru.rita.simple.java.heaphash;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWordsStream {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> map = new TreeMap<>(String::compareTo);
        Arrays.stream(words).forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));

        return map.entrySet()
                .stream()
                .sorted((v1, v2) -> Integer.compare(v2.getValue(), v1.getValue()))
                .map(v1 -> v1.getKey())
                .limit(k)
                .collect(Collectors.toList());
    }
}

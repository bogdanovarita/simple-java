package ru.rita.simple.java.hashtable;

import java.util.*;

public class ListOfListComparator implements Comparator<List<List<Integer>>> {
    @Override
    public int compare(List<List<Integer>> list1, List<List<Integer>> list2) {
        if (list1 == null && list2 == null) {
            return 0;
        }
        if (list1 == null) {
            return -1;
        }
        if (list2 == null) {
            return -1;
        }
        if (list1.size() != list2.size()) {
            return -1;
        }

        List<List<Integer>> listCopy1 = getSortedCopy(list1);
        List<List<Integer>> listCopy2 = getSortedCopy(list2);

        if (isList1EqualsList2(listCopy1, listCopy2)) {
            return 0;
        }

        if (isList1EqualsList2(listCopy2, listCopy1)) {
            return 0;
        }

        return -1;
    }

    private List<List<Integer>> getSortedCopy(List<List<Integer>> list) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> inner : list) {
            List<Integer> innerCopy = new ArrayList<>(inner);
            Collections.sort(innerCopy);
            result.add(innerCopy);
        }
        return result;
    }

    private boolean isList1EqualsList2(List<List<Integer>> list1, List<List<Integer>> list2) {
        for (List<Integer> inner1 : list1) {
            boolean isEqualExists = false;
            for (List<Integer> inner2 : list2) {
                isEqualExists = (inner1.equals(inner2));
                if (isEqualExists){
                    break;
                }
            }
            if (!isEqualExists) {
                return false;
            }
        }
        return true;
    }
}

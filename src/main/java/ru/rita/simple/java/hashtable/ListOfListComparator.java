package ru.rita.simple.java.hashtable;

import java.util.*;

public class ListOfListComparator<T extends Comparable<? super T>> implements Comparator<List<List<T>>> {
    @Override
    public int compare(List<List<T>> list1, List<List<T>> list2) {
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

        List<List<T>> listCopy1 = getSortedCopy(list1);
        List<List<T>> listCopy2 = getSortedCopy(list2);

        if (isList1EqualsList2(listCopy1, listCopy2)) {
            return 0;
        }

        if (isList1EqualsList2(listCopy2, listCopy1)) {
            return 0;
        }

        return -1;
    }

    public boolean isTheSame(List<List<T>> list1, List<List<T>> list2){
        return compare(list1, list2) == 0;
    }

    private List<List<T>> getSortedCopy(List<List<T>> list) {
        List<List<T>> result = new ArrayList<>();
        for (List<T> inner : list) {
            List<T> innerCopy = new ArrayList<>(inner);
            Collections.sort(innerCopy);
            result.add(innerCopy);
        }
        return result;
    }

    private boolean isList1EqualsList2(List<List<T>> list1, List<List<T>> list2) {
        for (List<T> inner1 : list1) {
            boolean isEqualExists = false;
            for (List<T> inner2 : list2) {
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

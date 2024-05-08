package ru.rita.simple.java.lists;

import java.util.Comparator;

public class ListNodeComparator implements Comparator<ListNode> {


    /*
      @implNote returns: 0 - list1 == list 2
                         -1 - otherwise
     */
    @Override
    public int compare(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return 0;
        }

        if (list1 == null) {
            return -1;
        }

        if (list2 == null) {
            return -1;
        }

        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return -1;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        if ((list1 == null && list2 != null) ||
                (list1 != null && list2 == null)) {
            return -1;
        }

        return 0;
    }
}

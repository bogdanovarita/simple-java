package ru.rita.simple.java;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        Queue<Integer> test = new PriorityQueue<>(Collections.reverseOrder());
        test.add(3);
        test.add(4);
        test.add(1);
        test.add(2);
        System.out.println(test);
        System.out.println(test.poll());
        System.out.println(test);
        System.out.println(test.poll());
        System.out.println(test);
    }
}
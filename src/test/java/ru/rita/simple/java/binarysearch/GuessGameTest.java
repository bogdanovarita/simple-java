package ru.rita.simple.java.binarysearch;

import junit.framework.TestCase;

public class GuessGameTest extends TestCase {

    public void testGuess_when_guess_less_then_pick() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(7);
        int result = gamer.guess(6);
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    public void testGuess_when_guess_greater_then_pick() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(4);
        int result = gamer.guess(6);
        int expectedResult = -1;
        assertEquals(expectedResult, result);
    }

    public void testGuess_when_guess_equals_pick() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(4);
        int result = gamer.guess(4);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    public void testGuess_when_bounds_equals_one() {
        GuessGame gamer = new GuessGame();
        int result = gamer.guess(1);
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_10_elems_and_elem_in_the_tail() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(7);
        int result = gamer.guessNumber(10);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_10_elems_and_elem_in_the_begin() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(2);
        int result = gamer.guessNumber(10);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_10_elems_and_elem_in_the_middle() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(5);
        int result = gamer.guessNumber(10);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_21_elems_and_elem_in_the_tail() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(18);
        int result = gamer.guessNumber(21);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_21_elems_and_elem_in_the_begin() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(1);
        int result = gamer.guessNumber(21);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    public void testGuessNumber_when_21_elems_and_elem_in_the_middle() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(10);
        int result = gamer.guessNumber(21);
        int expectedResult = gamer.getPickNumber();
        assertEquals(expectedResult, result);
    }

    //There is no such case in the task. But it can be case when I guess number not in the range;
    public void testGuessNumber_when_pick_is_incorrect_and_greater() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(31);
        int result = gamer.guessNumber(21);
        int expectedResult = 21;
        assertEquals(expectedResult, result);
    }

    //There is no such case in the task. But it can be case when I guess number not in the range;
    public void testGuessNumber_when_pick_is_incorrect_and_less() {
        GuessGame gamer = new GuessGame();
        gamer.setPickNumber(0);
        int result = gamer.guessNumber(21);
        int expectedResult = 21;
        assertEquals(expectedResult, result);
    }
}
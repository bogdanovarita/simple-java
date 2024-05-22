package ru.rita.simple.java.binarysearch;

/*
374. Guess Number Higher or Lower
https://leetcode.com/problems/guess-number-higher-or-lower/description/

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
 */
public class GuessGame {

    private int pickNumber;
    private int minValue = 1;
    private int maxValue = 10;

    public GuessGame() {
        generateGuessNumber(maxValue);
    }

    public GuessGame(int pickNumber, int minValue, int maxValue) {
        this.pickNumber = pickNumber;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    private void generateGuessNumber(int maxValue) {
        this.maxValue = maxValue;
        pickNumber = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int median = left + (right - left)/2;
            int guess = guess(median);
            if (guess == 0) {return median;}
            if (guess < 0) {
                right = median - 1;
            } else {
                left = median + 1;
            }
        }
        return n;
    }

    public int getPickNumber() {
        return pickNumber;
    }

    public void setPickNumber(int pickNumber) {
        this.pickNumber = pickNumber;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int guess(int num) {
        if (num > pickNumber) {
            return -1;
        }
        if (num < pickNumber) {
            return 1;
        }
        return 0;
    }

}

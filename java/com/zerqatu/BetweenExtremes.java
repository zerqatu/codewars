/*
Between Extremes (7 kyu)
https://www.codewars.com/kata/5266876b8f4bf2da9b000362

Given an array of numbers, return the difference between the largest and smallest values.
*/

package com.zerqatu;

import java.util.Arrays;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers)
    {
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        return max - min;
    }
}

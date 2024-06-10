/*
Sort the odd (6 kyu)
https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

You will be given an array of numbers.
You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
*/

package com.zerqatu;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        var sortedOdds = Arrays.stream(array).filter(v -> v % 2 == 1).sorted().toArray();
        for (int i = 0, s = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = sortedOdds[s];
                s++;
            }
        }
        return array;
    }
}

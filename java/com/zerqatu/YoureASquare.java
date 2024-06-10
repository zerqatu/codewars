/*
You're a square! (7 kyu)
https://www.codewars.com/kata/54c27a33fb7da0db0100040e

Given an integral number, determine if it's a square number.
*/

package com.zerqatu;

public class YoureASquare {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}

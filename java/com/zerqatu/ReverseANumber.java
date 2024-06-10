/*
Reverse a Number (7 kyu)
https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5

Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)
Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.
*/

package com.zerqatu;

public class ReverseANumber {
    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return reverse;
    }
}

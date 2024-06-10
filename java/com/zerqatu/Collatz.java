/*
Collatz (6 kyu)
https://www.codewars.com/kata/5286b2e162056fd0cb000c20

Create a function collatz that returns a collatz sequence string starting with the positive integer argument passed into the function, in the following form:
"X0->X1->...->XN"
Where Xi is each iteration of the sequence and N is the length of the sequence.
Don't worry about invalid input. Arguments passed into the function are guaranteed to be valid integers >= 1.
*/

package com.zerqatu;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public static String collatz(int n) {
        List<String> calculation = new ArrayList<>();
        while (n > 1) {
            calculation.add(Integer.toString(n));
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        calculation.add("1");

        return String.join("->", calculation);
    }
}

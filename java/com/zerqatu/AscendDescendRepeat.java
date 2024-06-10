/*
Ascend, Descend, Repeat? (6 kyu)
https://www.codewars.com/kata/62ca07aaedc75c88fb95ee2f/train/java

You are given three integer inputs: length, minimum, and maximum.

Return a string that:
- starts at minimum
- ascends one at a time until reaching the maximum, then
- descends one at a time until reaching the minimum
- repeat until the string is the appropriate length

Examples:
length: 5, minimum: 1, maximum: 3   ==>  "12321"
length: 14, minimum: 0, maximum: 2  ==>  "01210121012101"
length: 11, minimum: 5, maximum: 9  ==>  "56789876567"

Notes:
- length will always be non-negative
- negative numbers can appear for minimum and maximum values
- hyphens/dashes ("-") for negative numbers do count towards the length
- the resulting string must be truncated to the exact length provided
- return an empty string if maximum < minimum or length == 0
- minimum and maximum can equal one another and result in a single number repeated for the length of the string
*/

package com.zerqatu;

public class AscendDescendRepeat {
    public static String ascendDescend(int length, int minimum, int maximum) {
        StringBuilder result = new StringBuilder();
        int currentNumber = minimum;
        int direction = 1;

        if (maximum < minimum || length == 0) {
            return "";
        }

        while (result.length() <= length) {
            result.append(currentNumber);
            if (minimum == maximum) {
                direction = 0;
            } else if (currentNumber == maximum) {
                direction = -1;
            } else if (currentNumber == minimum) {
                direction = 1;
            }
            currentNumber += direction;
        }

        return result.substring(0, length);
    }
}

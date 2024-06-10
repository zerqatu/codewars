/*
parseInt() reloaded (4 kyu)
https://www.codewars.com/kata/525c7c5ab6aecef16e0001a5

In this kata we want to convert a string into an integer. The strings simply represent the numbers in words.

Examples:
"one" => 1
"twenty" => 20
"two hundred forty-six" => 246
"seven hundred eighty-three thousand nine hundred and nineteen" => 783919

Additional Notes:
The minimum number is "zero" (inclusively)
The maximum number, which must be supported is 1 million (inclusively)
The "and" in e.g. "one hundred and twenty-four" is optional, in some cases it's present and in others it's not
All tested numbers are valid, you don't need to validate them
*/

package com.zerqatu;

import java.util.HashMap;

public class ParseIntReloaded {
    private static final HashMap<String, Integer> WORD_TO_NUMBER_MAP = new HashMap<String, Integer>() {{
        put("zero", 0);
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);
        put("five", 5);
        put("six", 6);
        put("seven", 7);
        put("eight", 8);
        put("nine", 9);
        put("ten", 10);
        put("eleven", 11);
        put("twelve", 12);
        put("thirteen", 13);
        put("fourteen", 14);
        put("fifteen", 15);
        put("sixteen", 16);
        put("seventeen", 17);
        put("eighteen", 18);
        put("nineteen", 19);
        put("twenty", 20);
        put("thirty", 30);
        put("forty", 40);
        put("fifty", 50);
        put("sixty", 60);
        put("seventy", 70);
        put("eighty", 80);
        put("ninety", 90);
        put("hundred", 100);
        put("thousand", 1000);
        put("million", 1000000);
    }};

    public static int parseInt(String input) {
        String[] words = input.split("[ -]+"); // split on spaces and hyphens
        int result = 0;
        int currentNumber = 0;
        for (String word : words) {
            if (word.equals("and")) {
                continue; // skip "and" if present
            }
            int number = WORD_TO_NUMBER_MAP.get(word);
            if (number < 100) { // 1-99
                currentNumber += number;
            } else if (number < 1000) { // 100-999
                currentNumber *= number;
            } else { // 1000-1000000
                result += currentNumber * number;
                currentNumber = 0;
            }
        }
        result += currentNumber;
        return result;
    }
}

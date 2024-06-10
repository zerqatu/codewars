/*
A Needle in the Haystack (8 kyu)
https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

Can you find the needle in the haystack?
Write a function findNeedle() that takes an array full of junk but containing one "needle"
After your function finds the needle it should return a message (as a string) that says:
"found the needle at position " plus the index it found the needle.
*/

package com.zerqatu;

import java.util.Arrays;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int needle = Arrays.asList(haystack).indexOf("needle");
        return "found the needle at position " + needle;
    }
}

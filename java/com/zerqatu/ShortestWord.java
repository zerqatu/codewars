/*
Shortest Word (7 kyu)
https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/java

Given a string of words, return the length of the shortest word(s).
*/

package com.zerqatu;

public class ShortestWord {
    public static int findShort(String s) {

        int smallestLength;
        String[] words = s.split(" ");
        smallestLength = words[0].length();
        for (String word : words) {
            if (word.length() < smallestLength) {
                smallestLength = word.length();
            }
        }
        return smallestLength;
    }
}

/*
Get the Middle Character (7 kyu)
https://www.codewars.com/kata/56747fd5cb988479af000028

You are going to be given a word.
Your job is to return the middle character of the word.
If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.
*/

package com.zerqatu;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int half = word.length() / 2;
        if (word.length() % 2 != 0) {
            return String.valueOf(word.charAt(half));
        }
        return String.valueOf(word.charAt(half - 1)) + String.valueOf(word.charAt(half));
    }
}

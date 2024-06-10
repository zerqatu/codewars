/*
Reverse words (7 kyu)
https://www.codewars.com/kata/5259b20d6021e9e14c0010d4

Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.
*/

package com.zerqatu;

public class ReverseWords {
    public static String reverseWords(final String original)
    {
        String[] words =original.split("\\s");
        StringBuilder reverseWord= new StringBuilder();
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb.toString()).append(" ");
        }
        if (original.isBlank()) {
            return original;
        }
        return reverseWord.toString().trim();
    }
}

/*
Find the odd int (6 kyu)
https://www.codewars.com/kata/54da5a58ea159efa38000836

Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
*/


package com.zerqatu;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        Optional<Integer> oddNumber = Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst();
        return oddNumber.get();
    }
}

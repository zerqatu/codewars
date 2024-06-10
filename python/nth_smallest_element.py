'''
Nth Smallest Element (Array Series #4) (7 kyu)
https://www.codewars.com/kata/5a512f6a80eba857280000fc

Given an array/list of integers, find the Nth smallest element in the array.
Array/list size is at least 3.
Array/list's numbers could be a mixture of positives , negatives and zeros.
Repetition in array/list's numbers could occur, so don't remove duplications.
'''


def nth_smallest(arr, pos):
    arr.sort()
    return arr[pos-1]

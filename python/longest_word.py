'''
Thinkful - List Drills: Longest word (7 kyu)
https://www.codewars.com/kata/58670300f04e7449290000e5

Complete the function that takes one argument, a list of words, and returns the length of the longest word in the list.
'''


def longest(words):
    return max(len(x) for x in words)

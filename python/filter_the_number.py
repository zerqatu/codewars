'''
Filter the number (7 kyu)
https://www.codewars.com/kata/55b051fac50a3292a9000025

You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.
'''


def filter_string(string):
    return int(''.join(filter(str.isdigit, string)))

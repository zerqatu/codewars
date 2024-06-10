'''
Maximum Multiple (7 kyu)
https://www.codewars.com/kata/5aba780a6a176b029800041c

Given a divisor and a bound, find the largest integer n such that
n is divisible by divisor
n is less than or equal to bound
n is greater than 0

The parameters (divisor, bound) passed to the function are only positive values.
It's guaranteed that a divisor is found.
'''


def max_multiple(divisor, bound):
    return bound - (bound % divisor)

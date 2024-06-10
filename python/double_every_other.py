'''
Double Every Other (7 kyu)
https://www.codewars.com/kata/5809c661f15835266900010a

Write a function that doubles every second integer in a list, starting from the left.
'''


def double_every_other(list):
    for index, item in enumerate(list):
        if index % 2 != 0:
            list[index] = item*2
    return list

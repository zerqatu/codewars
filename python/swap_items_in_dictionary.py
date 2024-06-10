'''
Swap items in a dictionary (7 kyu)
https://www.codewars.com/kata/5a21e090f28b824def00013c

In this kata, you will take the keys and values of a dict and swap them around.
You will be given a dictionary, and then you will want to return a dictionary with the old values as the keys, and list the old keys as values under their original keys.

The dictionary given will only contain strings.
The dictionary given will not be empty.
You do not have to sort the items in the lists.
'''

def switch_dict(dic):
    switch = {}
    for k, v in dic.items():
        if v not in switch:
            switch[v] = [k]
        else:
            switch[v].append(k)
    return switch
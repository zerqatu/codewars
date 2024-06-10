'''
My Language Skills (7 kyu)
https://www.codewars.com/kata/5b16490986b6d336c900007d

You are given a dictionary containing some languages and your test results in the given languages.
Return the list of languages where your test score is at least 60, in descending order of the scores.
Note: the scores will always be unique (so no duplicate values)
'''


def my_languages(results):
    return sorted([k for k, v in results.items() if v >= 60], key=lambda x: results[x], reverse=True)

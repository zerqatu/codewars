/*
SQL with LOTR: Elven Wildcards (7 kyu)
https://www.codewars.com/kata/5ad90fb688a0b74111000055

Deep within the fair realm of Lothlórien, you have been asked to create a shortlist of candidates for a recently vacated position on the council.
Of so many worthy elves, who to choose for such a lofty position? After much thought you decide to select candidates by name, which are often closely aligned to an elf's skill and temperament.
Choose those with tegil appearing anywhere in their first name, as they are likely to be good calligraphers, OR those with astar anywhere in their last name, who will be faithful to the role.

Elves table:
firstname
lastname

All names are in lowercase.
To aid the scribes, return the firstname and lastname column concatenated, separated by a space, into a single shortlist column, and capitalise the first letter of each name.
*/

SELECT concat (
               concat(upper(left(firstname,1)),substring(firstname,2)),
               ' ',
               concat(upper(left(lastname,1)),substring(lastname,2))
           ) AS shortlist
FROM elves
WHERE firstname LIKE '%tegil%' OR lastname LIKE '%astar%'

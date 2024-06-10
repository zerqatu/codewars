/*
SQL with Street Fighter: Total Wins (7 kyu)
https://www.codewars.com/kata/5ac698cdd325ad18a3000170

It's time to assess which of the world's greatest fighters are through to the 6 coveted places in the semi-finals of the Street Fighter World Fighting Championship.
Every fight of the year has been recorded and each fighter's wins and losses need to be added up.
However, due to new health and safety regulations, all ki blasts have been outlawed as a potential fire hazard.
Any bout that ended with Hadoken, Shouoken or Kikoken should not be counted in the total wins and losses.

Return name, won, and lost columns displaying the name, total number of wins and total number of losses. Group by the fighter's name.
Do not count any wins or losses where the winning move was Hadoken, Shouoken or Kikoken.
Order from most to least wins.
Return the top 6. Don't worry about ties.

fighters schema:
id
name
won
lost
move_id

winning_moves schema:
id
move
*/

SELECT f.name, SUM(f.won) AS won, SUM(f.lost) AS lost
FROM fighters f
JOIN winning_moves w
ON f.move_id = w.id
WHERE w.move not in ('Hadoken', 'Shouoken', 'Kikoken')
GROUP BY name
ORDER BY won DESC
LIMIT 6

/*
Top 10 customers by total payments amount (6 kyu)
https://www.codewars.com/kata/580d08b5c049aef8f900007c

You are working for a company that wants to reward its top 10 customers with a free gift.
You have been asked to generate a simple report that returns the top 10 customers by total amount spent ordered from highest to lowest.
Total number of payments has also been requested.

The query should output the following columns:
customer_id [int4]
email [varchar]
payments_count [int]
total_amount [float]

and has the following requirements:
only returns the 10 top customers, ordered by total amount spent from highest to lowest
*/

SELECT c.customer_id, c.email,
COUNT(p.payment_id) AS payments_count,
SUM(p.amount)::FLOAT AS total_amount
FROM customer c
INNER JOIN payment p
ON c.customer_id = p.customer_id
GROUP BY c.customer_id
ORDER BY sum(p.amount) DESC
LIMIT 10

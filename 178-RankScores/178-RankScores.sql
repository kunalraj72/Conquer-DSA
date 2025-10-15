-- Last updated: 16/10/2025, 04:28:21
# Write your MySQL query statement below
Select score, DENSE_RANK() over (order by score DESC) as 'rank'
from Scores
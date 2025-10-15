-- Last updated: 16/10/2025, 04:28:27
# Write your MySQL query statement below

Select P.firstName, P.lastName, A.city, A.state
from Person P LEFT JOIN Address A
on P.personId = A.personId


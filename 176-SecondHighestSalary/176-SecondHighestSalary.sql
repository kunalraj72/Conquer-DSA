-- Last updated: 16/10/2025, 04:28:23
# Write your MySQL query statement below
select case
when (select count(distinct salary) from Employee) <2

   then NULL 
   
ELSE
   (select distinct salary as SecondHighestSalary from Employee order by salary DESC LIMIT 1 offset 1)
   
end
as SecondHighestSalary
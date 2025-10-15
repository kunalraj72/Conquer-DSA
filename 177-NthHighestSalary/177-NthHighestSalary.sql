-- Last updated: 16/10/2025, 04:28:22
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from Employee order by salary DESC LIMIT 1 offset N
      
      #Table ko pehle desc order me arrange kiye based on order and then  Limit 1 
      #set kiye kyuki hume ek hi value chahiya tha but limit hamesha upar se n value 
      #pick karta hai isliye hum upar k N-1 rows erase kar diye using set N = N-1
      # and offset N argument.
  );
END
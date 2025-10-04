# Write your MySQL query statement below
SELECT (
    SELECT distinct salary 
    from Employee
    Order by salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;
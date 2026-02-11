CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      Select Distinct salary
      From(
        Select salary,
        Dense_rank() OVER (Order by salary DESC) as salary_rank
        From Employee
      ) sub 
      Where salary_rank = N

  );
END
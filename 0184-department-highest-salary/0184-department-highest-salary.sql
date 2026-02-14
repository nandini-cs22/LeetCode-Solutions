# Write your MySQL query statement below
Select e.name as Employee,
    d.name as Department,
    e.salary as Salary
From Employee e
Join Department d
On e.departmentId = d.id
Where e.salary = (
    Select MAX(e2.salary)
    From Employee e2
    Where e2.departmentId = e.departmentId
);
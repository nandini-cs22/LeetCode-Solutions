# Write your MySQL query statement below
Select Distinct num AS ConsecutiveNums
From (
    Select num,
        Lead(num,1) Over (Order By id) AS next1,
        Lead(num,2) Over (Order By id) AS next2
        From Logs
) AS temp
Where num = next1 AND next1 = next2;   

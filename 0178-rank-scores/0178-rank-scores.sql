# Write your MySQL query statement below
Select 
    score,
    Dense_rank() over (Order By score DESC) as'rank'
From Scores;
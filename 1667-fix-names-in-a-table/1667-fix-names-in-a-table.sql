# Write your MySQL query statement below

SELECT user_id,  CONCAT(  UPPER(substring(name,1,1))  ,
LOWER(substring(name,2,LENGTH(name)))  
) as name from Users
ORDER BY user_id;
-- 코드를 작성해주세요
SELECT b.id, CASE WHEN b.rate <= 0.25 THEN 'CRITICAL'
                WHEN b.rate <= 0.5 THEN 'HIGH'
                WHEN b.rate <= 0.75 THEN 'MEDIUM'
                WHEN b.rate <= 1 THEN 'LOW' END AS COLONY_NAME
FROM(
SELECT a.id, a.size_of_colony, percent_rank() over (order by size_of_colony desc) AS rate
FROM ECOLI_DATA a
ORDER BY rate
    ) b
ORDER BY ID;
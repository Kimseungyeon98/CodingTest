-- 코드를 작성해주세요
SELECT A.ID, CASE WHEN a.size_of_colony <= 100 THEN 'LOW'
            WHEN a.size_of_colony > 100 AND a.size_of_colony <= 1000 THEN 'MEDIUM'
            WHEN a.size_of_colony > 1000 THEN 'HIGH'
            END as SIZE
FROM ECOLI_DATA A
ORDER BY A.id
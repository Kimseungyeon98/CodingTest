-- 코드를 입력하세요
SELECT APPOINTMENT.MCDP_CD AS '진료과코드', COUNT(APPOINTMENT.MCDP_CD) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY APPOINTMENT.MCDP_CD
ORDER BY COUNT(APPOINTMENT.MCDP_CD) , APPOINTMENT.MCDP_CD
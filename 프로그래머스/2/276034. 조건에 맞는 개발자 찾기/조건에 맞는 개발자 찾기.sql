SELECT ID,EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME LIKE 'C#')
OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME LIKE 'Python')
ORDER BY ID ASC

-- PYTHON = 256
-- C# = 1024

SELECT
    brand,
    COUNT(*) AS row_amount,
    COUNT(DISTINCT year) AS unique_years,
    MIN(year) AS first_year,
    MAX(year) AS last_year,
    SUM(year) AS total_years,
    AVG(year) AS avg_year
FROM Car GROUP BY brand;

SELECT
    brand,
    COUNT(*) AS row_amount,
    COUNT(DISTINCT year) AS unique_years,
    MIN(year) AS first_year,
    MAX(year) AS last_year,
    SUM(year) AS total_years,
    AVG(year) AS avg_year
FROM Car GROUP BY brand HAVING MIN(year) > 1999;

-- Ford ->  Ford,Mustang,2005,Red
-- VW ->    VW,T-Cross,2024,White
--          VW,T-Roc,2023,Red
--          VW,Golf,1999,Blue
--          VW,Passat,2001,Red
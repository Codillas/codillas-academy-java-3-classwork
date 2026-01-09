SELECT AVG(year) FROM Car;

SELECT AVG(year) FROM Car WHERE year = 1970;

SELECT AVG(brand::INT) FROM Car;

SELECT AVG(year) FROM Car WHERE year < 0;
SELECT MIN(year) FROM Car WHERE year < 0;
SELECT MAX(year) FROM Car WHERE year < 0;

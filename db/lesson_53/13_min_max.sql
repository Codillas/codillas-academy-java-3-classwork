SELECT MIN(year) FROM Car;

SELECT MAX(year) FROM Car;

SELECT MAX(color) FROM Car;
SELECT MIN(color) FROM Car;

SELECT MAX(brand) FROM Car;
SELECT MIN(brand) FROM Car;

SELECT MIN(brand) FROM Car WHERE year > 2000;
SELECT MAX(brand) FROM Car WHERE year > 2000;

SELECT MIN(brand) FROM Car;
SELECT brand FROM Car ORDER BY brand LIMIT 1;
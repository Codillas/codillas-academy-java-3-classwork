SELECT model, brand, year FROM Car;

SELECT * FROM Car;


SELECT * FROM Car LIMIT 10;

SELECT * FROM Car WHERE year > 2000 AND year < 2025;

SELECT * FROM Car WHERE year IS NULL; -- == NULL
SELECT * FROM Car WHERE year IS NOT NULL; -- != NULL

SELECT * FROM Car WHERE year = 2025 OR brand = 'BMW' OR model = 'X6';
SELECT * FROM Car WHERE year != 2025;

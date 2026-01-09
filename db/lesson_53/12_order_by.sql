SELECT * FROM Car;

SELECT * FROM Car ORDER BY year;

SELECT * FROM Car ORDER BY year DESC;

-- First filter and remove NULL values and then sort by year in ascending order
SELECT * FROM Car WHERE year IS NOT NULL ORDER BY year;

-- For strings the DB uses alphabetical order to sort
SELECT * FROM Car ORDER BY model DESC;

SELECT * FROM Car ORDER BY brand;

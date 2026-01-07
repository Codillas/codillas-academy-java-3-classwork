SELECT * FROM Car WHERE year IS NULL; -- == NULL

UPDATE Car SET year = 2019;

UPDATE Car SET year = 2021 WHERE brand = 'BMW';

UPDATE Car
SET model = 'Camri', year = 1970
WHERE brand = 'Toyota';

SELECT * FROM Car WHERE brand = 'Toyota';


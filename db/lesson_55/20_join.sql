SELECT *
FROM cars
WHERE brand = 'BMW';

SELECT id
FROM cars
WHERE brand = 'BMW';

-- Every Car has 1 Car_Key

SELECT *
FROM car_keys
WHERE car_id = '1df31024-6aa5-4ba4-9362-dbf0e5f3a5d4'
   OR car_id = 'be8c7075-f6e6-4524-af73-47097767497a'
   OR car_id = 'a844049b-7481-4046-ae91-b417a6cef524';

SELECT *
FROM car_keys
WHERE car_id IN ('1df31024-6aa5-4ba4-9362-dbf0e5f3a5d4', 'be8c7075-f6e6-4524-af73-47097767497a',
                 'a844049b-7481-4046-ae91-b417a6cef524');

SELECT cars.id       AS car_id,
       cars.brand    AS car_brand,
       cars.model    AS car_model,
       cars.vin      AS car_vin,
       car_keys.code AS car_key_code
FROM cars
         JOIN car_keys ON cars.id = car_keys.car_id
WHERE brand = 'BMW';


SELECT *
FROM authors
         LEFT JOIN authors_books ON authors.id = authors_books.author_id;

SELECT *
FROM authors
         JOIN authors_books ON authors.id = authors_books.author_id;

SELECT *
FROM authors
         LEFT JOIN authors_books ON authors.id = authors_books.author_id
         LEFT JOIN books ON books.id = authors_books.book_id;

SELECT authors.name AS author, books.name AS book_name, books.genre AS book_genre
FROM authors
         LEFT JOIN authors_books ON authors.id = authors_books.author_id
         LEFT JOIN books ON books.id = authors_books.book_id
WHERE authors.name = 'Taras Shevchenko';

SELECT *
FROM authors
         FULL JOIN authors_books ON authors.id = authors_books.author_id
         FULL JOIN books ON books.id = authors_books.book_id;

SELECT authors.name AS author, books.name AS book_name, books.genre AS book_genre
FROM authors
         FULL JOIN authors_books ON authors.id = authors_books.author_id
         FULL JOIN books ON books.id = authors_books.book_id;

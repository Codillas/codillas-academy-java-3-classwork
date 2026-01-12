CREATE TABLE Authors
(
    id   UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL
);

CREATE TABLE Books
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name  TEXT NOT NULL,
    genre TEXT NOT NULL
);

CREATE TABLE Authors_Books
(
    author_id UUID REFERENCES Authors (id),
    book_id   UUID REFERENCES Books (id),
    PRIMARY KEY (author_id, book_id)
);

-- Alternative solution
CREATE TABLE Authors_Books_V2
(
    id        UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    author_id UUID NOT NULL REFERENCES Authors (id),
    book_id   UUID NOT NULL REFERENCES Books (id),
    UNIQUE (author_id, book_id)
);

SELECT * FROM Authors_Books_V2;
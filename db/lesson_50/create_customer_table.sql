CREATE TABLE Customer
(
    id            UUID PRIMARY KEY,
    first_name    TEXT,
    last_name     TEXT,
    registered_at DATE,
    is_active     BOOLEAN
);

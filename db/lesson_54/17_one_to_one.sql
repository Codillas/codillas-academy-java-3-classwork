-- PRIMARY KEY (make column as a primary key)
-- DEFAULT gen_random_uuid() - generate random UUID if not specified
-- NOT NULL - make column not nullable
-- UNIQUE - make column unique
CREATE TABLE IF NOT EXISTS Cars
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    brand TEXT NOT NULL,
    model TEXT NOT NULL,
    vin   TEXT NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS Car_Keys
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code  TEXT NOT NULL UNIQUE,
    car_id UUID NOT NULL UNIQUE REFERENCES Cars(id)
);

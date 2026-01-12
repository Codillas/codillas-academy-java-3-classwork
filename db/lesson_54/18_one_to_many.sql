CREATE TABLE IF NOT EXISTS Customers
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Orders
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    date DATE NOT NULL,
    customer_id UUID NOT NULL REFERENCES Customers(id)
);

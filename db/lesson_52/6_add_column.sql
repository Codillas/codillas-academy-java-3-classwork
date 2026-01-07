ALTER TABLE Car ADD color TEXT;

ALTER TABLE Car ADD bolor TEXT NOT NULL DEFAULT 'white';

ALTER TABLE Car
    ADD aolor TEXT,
    ADD holor TEXT,
    ADD dolor TEXT;

SELECT * FROM Car;

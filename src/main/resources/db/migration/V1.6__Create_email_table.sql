CREATE TABLE emails (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    created_date TIMESTAMP
);
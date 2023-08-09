CREATE TABLE digital_materials (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    author_name VARCHAR(100) NOT NULL,
    author_photo VARCHAR(1000) NOT NULL,
    link VARCHAR(1000) NOT NULL,
    created_date TIMESTAMP,
    update_date TIMESTAMP
);
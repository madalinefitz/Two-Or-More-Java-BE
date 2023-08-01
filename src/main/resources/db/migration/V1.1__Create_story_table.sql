--create story table--

CREATE TABLE stories (
    id BIGSERIAL PRIMARY KEY,
    story VARCHAR(250) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_initial CHAR(1) NOT NULL,
    created_date TIMESTAMP
);
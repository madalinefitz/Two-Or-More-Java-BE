-- Create the vocabulary table
CREATE TABLE vocabulary (
                            id SERIAL PRIMARY KEY,
                            term VARCHAR(100) NOT NULL,
                            definition VARCHAR(250) NOT NULL,
                            created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            update_date TIMESTAMP
);

-- Create a trigger function to update the update_date column
CREATE OR REPLACE FUNCTION update_update_date()
  RETURNS TRIGGER AS $$
BEGIN
  NEW.update_date = CURRENT_TIMESTAMP;
RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Create a trigger to execute the update_update_date function on update
CREATE TRIGGER update_update_date_trigger
    BEFORE UPDATE ON vocabulary
    FOR EACH ROW
    EXECUTE FUNCTION update_update_date();

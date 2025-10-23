-- create the database
CREATE DATABASE IF NOT EXISTS studentdb;

-- use the database
USE studentdb;

-- create the student table
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL
);

-- optional: insert sample data
INSERT INTO students (name, age) VALUES
('Alice', 20),
('Bob', 22),
('Charlie', 19);

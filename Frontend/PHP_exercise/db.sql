
-- create
CREATE TABLE classmates (
id INTEGER PRIMARY KEY, 
name TEXT NOT NULL, 
age TEXT NOT NULL,
adress TEXT NOT NULL
);

-- insert
INSERT INTO classmates VALUES (1, 'Rustem', '47', 'Surgut');
INSERT INTO classmates VALUES (2, 'Анжела', '27', 'Moscow');
INSERT INTO classmates VALUES (3, 'Сергей', '18', 'Chelyabinsk');
INSERT INTO classmates VALUES (4, 'Марина', '42', 'Saint-Petersburg');
INSERT INTO classmates VALUES (5, 'Александр', '34', 'Kazan');
INSERT INTO classmates VALUES (6, 'Светлана', '17', 'Berlin');

-- fetch
SELECT * FROM classmates WHERE age > '20';
CREATE TABLE Movies (
movie_id INT PRIMARY KEY,
title VARCHAR(255) NOT NULL,
director VARCHAR(255) NOT NULL,
release_year INT NOT NULL,
);

INSERT INTO Movies (movie_id, title, director, release_year)
VALUES (1, "фильм1", "директор1", 2000);
INSERT INTO Movies (movie_id, title, director, release_year)
VALUES (2, "фильм2", "директор2", 2002);
INSERT INTO Movies (movie_id, title, director, release_year)
VALUES (3, "фильм3", "директор3", 2003);

select * FROM Movies;

UPDATE Movies;
SET release_year = 2001
WHERE movie_id = 1;

DELETE FROM Movies
WHERE movie_id = 2;

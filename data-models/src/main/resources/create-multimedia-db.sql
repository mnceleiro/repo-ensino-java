CREATE DATABASE IF NOT EXISTS multimedia_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

SET default_storage_engine=InnoDB;

use multimedia_db;

-- drops
drop table if exists pelicula_actor;
drop table if exists pelicula;
drop table if exists actor;
drop table if exists director;

CREATE TABLE director (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    apelidos VARCHAR(100) NOT NULL
);

CREATE TABLE pelicula (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    data_estrea DATE NOT NULL,
    duracion_minutos INT NOT NULL,
    id_director BIGINT NOT NULL,
    FOREIGN KEY (id_director) REFERENCES director(id)
);

CREATE TABLE actor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    apelidos VARCHAR(100) NOT NULL,
    data_nacemento DATE NOT NULL
);

CREATE TABLE pelicula_actor (
    id_pelicula BIGINT NOT NULL,
    id_actor BIGINT NOT NULL,
    PRIMARY KEY (id_pelicula, id_actor),
    FOREIGN KEY (id_pelicula) REFERENCES pelicula(id),
    FOREIGN KEY (id_actor) REFERENCES actor(id)
);

-- Inserts
INSERT INTO director (id, nome, apelidos) VALUES
(1, 'Pedro', 'Almodóvar'),
(2, 'Alejandro', 'Amenábar'),
(3, 'Isabel', 'Coixet'),
(4, 'Fernando', 'Trueba'),
(5, 'Luis', 'Buñuel');

INSERT INTO pelicula (id, titulo, data_estreia, duracion_minutos, id_director) VALUES
(1, 'Todo sobre a miña nai', '1999-04-19', 101, 1),
(2, 'Mar dentro', '2004-09-03', 125, 2),
(3, 'A vida secreta das palabras', '2005-09-16', 115, 3),
(4, 'Belle Époque', '1992-12-13', 109, 4),
(5, 'Un can andaluz', '1929-06-06', 16, 5),
(6, 'Hable con ela', '2002-03-15', 112, 1),
(7, 'Os outros', '2001-08-10', 104, 2);

INSERT INTO actor (id, nome, apelidos, data_nacemento) VALUES
(1, 'Antonio', 'Banderas', '1960-08-10'),
(2, 'Penélope', 'Cruz', '1974-04-28'),
(3, 'Javier', 'Bardem', '1969-03-01'),
(4, 'Emma', 'Suárez', '1964-06-25'),
(5, 'Carmen', 'Maura', '1945-09-15'),
(6, 'Eduardo', 'Noriega', '1973-08-01'),
(7, 'Maribel', 'Verdú', '1970-10-02'),
(8, 'Victoria', 'Abril', '1959-07-04'),
(9, 'Fernando', 'Rey', '1917-09-20');

INSERT INTO pelicula_actor (id_pelicula, id_actor) VALUES
-- Actores en "Todo sobre a miña nai"
(1, 2),
(1, 5),
(1, 8),

-- Actores en "Mar dentro"
(2, 3),
(2, 6),

-- Actores en "A vida secreta das palabras"
(3, 4),
(3, 6),

-- Actores en "Belle Époque"
(4, 7),
(4, 9),

-- Actores en "Un can andaluz"
(5, 9),

-- Actores en "Hable con ela"
(6, 2),
(6, 4),
(6, 8),

-- Actores en "Os outros"
(7, 6),
(7, 7),
(7, 3);
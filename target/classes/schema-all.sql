DROP TABLE people IF EXISTS;

CREATE TABLE people  (
    id integer  NOT NULL,
    nom VARCHAR(20),
    prenom VARCHAR(20),
	email VARCHAR(20),
    PRIMARY KEY (  person_id )
);

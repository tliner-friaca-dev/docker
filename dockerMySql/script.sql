CREATE DATABASE IF NOT EXISTS
    appbanco;
USE appbanco;

CREATE TABLE IF NOT EXISTS documento (
    id INT(11) AUTO_INCREMENT,
    nome VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO documento VALUE(0, 'Documento 1');
INSERT INTO documento VALUE(0, 'Documento 2');
INSERT INTO documento VALUE(0, 'Documento 3');
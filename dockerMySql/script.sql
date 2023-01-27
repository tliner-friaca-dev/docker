CREATE DATABASE IF NOT EXISTS
    appbanco;
USE appusuario;

CREATE TABLE IF NOT EXISTS produto (
    id INT(11) AUTO_INCREMENT,
    nome VARCHAR(255),
    preco DECIMAL(10,2),
    PRIMARY KEY (id)
);

INSERT INTO produto VALUE(0, 'Produto 1', 4500);
INSERT INTO produto VALUE(0, 'Produto 2', 283);
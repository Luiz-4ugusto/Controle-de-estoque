CREATE DATABASE IF NOT EXISTS db_controledeestoque;
USE db_controledeestoque;


CREATE TABLE `tb_categoria` (
  `id` int NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `embalagem` varchar(100),
  `tamanho` varchar(100),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `tb_produto` (
  `id` int NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `min` int DEFAULT NULL,
  `max` int DEFAULT NULL,
  `unidade` varchar(50) DEFAULT NULL,
  `categoria_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria_id` (`categoria_id`),
  CONSTRAINT `tb_produto_ibfk_1` FOREIGN KEY (`categoria_id`) REFERENCES `tb_categoria` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `tb_usuarios` (
  `id_cadastro` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_cadastro`),
  UNIQUE KEY `id_cadastro_UNIQUE` (`id_cadastro`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

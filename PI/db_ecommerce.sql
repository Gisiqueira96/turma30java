
use db_ecommerce_PI;

CREATE TABLE `tb_categoria` (
	`id_categoria` int NOT NULL AUTO_INCREMENT,
	`nome_ong` varchar(100) NOT NULL,
	`local_atuacao` varchar(100) NOT NULL,
	`tipo` varchar(100) NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `tb_produto` (
	`id_produto` int NOT NULL AUTO_INCREMENT,
	`nome_produto` varchar(100) NOT NULL,
	`valor` DECIMAL(9,2) NOT NULL,
	`estoque` int(4) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`id_categoria` int NOT NULL,
	PRIMARY KEY (`id_produto`)
);

CREATE TABLE `tb_usuario` (
	`id_usuario` int NOT NULL AUTO_INCREMENT,
	`nome_completo` varchar(100) NOT NULL,
	`email` varchar(100) NOT NULL UNIQUE,
	`senha` varchar(100) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria`(`id_categoria`);
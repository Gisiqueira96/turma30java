#O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

use db_cidade_das_frutas;

create table tb_categoria(
id int(10) auto_increment,
tipo varchar(50) not null, -- Verdura, Fruta, Legumes
nasce varchar(50) not null, -- Árvore, Arbusto, Terra
primary key (id)
)
	engine=InnoDB;
    
create table tb_produto (
id_produto int(10) auto_increment,
nome varchar(50) not null,
valor decimal(10,2),
peso decimal(10,2),
categoria_id int(10) not null,
foreign key (categoria_id) references tb_categoria (id),
primary key (id_produto)
)
	engine=InnoDB;
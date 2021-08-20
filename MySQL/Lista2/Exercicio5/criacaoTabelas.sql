#O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

use db_construindo_a_nossa_vida;

create table tb_categoria (
id int(10) auto_increment,
categoria varchar(50) not null, -- construção, hidraulica, eletrica, pintura
corredor int(10) not null, -- 1-10
primary key (id)
)
	engine=InnoDB;
    
create table tb_produto (
id_produto int(10) auto_increment,
nome varchar(50) not null,
valor decimal(10,2) not null,
estoque int(10) not null,
ativo char (1) not null check (ativo in('S', 'N')),
categoria_id int(10) not null,
foreign key (categoria_id) references tb_categoria (id),
primary key (id_produto)
)
	engine=InnoDB;
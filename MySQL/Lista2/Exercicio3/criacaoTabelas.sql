#O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

use db_farmacia_do_bem;

create table tb_categoria (
id int (10) auto_increment,
tipo varchar(50) not null, -- medicamento, higiene, alimento.
receita char (1) not null  check (receita in ('S', 'N')),
primary key (id)
)
	engine=InnoDB;
    
create table tb_produto (
id_produto int(10) auto_increment,
nome varchar(50) not null,
valor decimal(10,2) not null,
quantidade int (5) not null,
categoria_id int(10) not null,
foreign key (categoria_id) references tb_categoria(id),
primary key (id_produto)
)
	engine=InnoDB;

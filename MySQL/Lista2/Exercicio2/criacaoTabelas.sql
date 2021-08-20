#O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

use db_pizzaria_legal;

create table tb_categoria (
id int (10) auto_increment,
tipo varchar (50) not null, -- Doce ou Salgada
tamanho char (1) not null  check (tamanho in ('P', 'M', 'G')),
primary key (id)
)
engine=InnoDB;

create table tb_pizza(
id_pizza int(10) auto_increment,
sabor varchar(50) not null,
valor decimal(10,2) not null,
borda char (1) not null  check (borda in ('S', 'N')),
categoria_id int(10) not null,
foreign key (categoria_id) references tb_categoria(id),
primary key (id_pizza)
)
engine=InnoDB;
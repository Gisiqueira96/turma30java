#O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.

use db_cursoDaMinhaVida;

create table tb_categoria(
id int(10) auto_increment,
professor varchar(50) not null,
tipo varchar(50) not null, -- front-end, back-end
primary key (id)
)
	engine=InnoDB;
    
create table tb_curso(
id_curso int(10) auto_increment,
nome varchar(50) not null,
valor decimal(10,2) not null,
tempo_dias int(10) not null,
categoria_id int(10) not null,
foreign key (categoria_id) references tb_categoria(id),
primary key(id_curso)
)
	engine=InnoDB;
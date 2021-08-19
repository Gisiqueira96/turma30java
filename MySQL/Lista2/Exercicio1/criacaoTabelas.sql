#O sistema trabalhará com 2 tabelas tb_personagem e tb_classe. Crie-as.

use db_generation_game_online;

create table tb_classe (
id_classe int (10) auto_increment,
carater varchar(50) not null, -- bondoso, malvado
tipos varchar(50) not null, -- bandido, policial, assassino, heroi
primary key (id_classe)
) engine=InnoDB;

show tables;

create table tb_personagem (
id_personagem int (10) auto_increment,
nome varchar(50) not null,
poderataque int(11) not null,
poderdefesa int (11) not null,
classe_id int (10) not null,
foreign key (classe_id) references tb_classe(id_classe),
primary key (id_personagem)
) engine=InnoDB;

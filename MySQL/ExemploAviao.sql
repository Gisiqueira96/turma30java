
#Criação do banco de dados
create database voo321;

#Criação da tabela
use voo321;

create table aviao (
id_aviao int(11) not null,
modelo varchar(50) not null,
primary key (id_aviao)
) 
engine=InnoDB;

desc aviao;

show tables;

create table tripulantes (
id_tripulantes int(11) not null, 
nome varchar(50) not null,
genero char (1) not null  check (genero in ('F', 'M', 'N')),
id_aviao int(11) not null,
foreign key (id_aviao) references aviao(id_aviao),
primary key (id_tripulantes)
)
engine=InnoDB;

desc tripulantes;
show tables;

#Popular avião.
-- insert into aviao values (1,"Zoom"),(2,'Boing'),(3,'Excelcior');
INSERT INTO aviao VALUES (1,'Zoom');
INSERT INTO aviao VALUES (2,'Boing');
INSERT INTO aviao VALUES (3,'Excelcior');
desc aviao;
select * from aviao;

#Popular tripulação
INSERT INTO tripulantes VALUES (16,'James Kirk', 'M', 1);
INSERT INTO tripulantes VALUES (86,'Catherine', 'F', 2);
INSERT INTO tripulantes VALUES (87,' Uhura', 'F', 1);
INSERT INTO tripulantes VALUES (48, 'Ikaru Sulu', 'M', 3);
INSERT INTO tripulantes VALUES (52, 'Tuvok', 'M', 2);
INSERT INTO tripulantes VALUES (1,'Jhony','M',1);
INSERT INTO tripulantes VALUES (20, 'Sasha', 'N', 2);
INSERT INTO tripulantes VALUES (30, 'Uhura', 'F', 1);
INSERT INTO tripulantes VALUES (66, 'Price', 'N', 3);
INSERT INTO tripulantes VALUES (55, 'Taira', 'N', 2);
select * from tripulantes;


select * from tripulantes where genero = 'F';

update tripulantes set genero = 'N' 
where genero = 'F';

select * from tripulantes where genero = 'N';

-- Destravar o modo de segurança.
SET SQL_SAFE_UPDATES = 0;

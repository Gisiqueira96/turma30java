#Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
#relevantes dos estudantes para se trabalhar com o serviço dessa escola.

use db_escola;

create table tb_alunos(
id bigint(5) auto_increment,
nome varchar(25) not null,
turma varchar(15) not null,
nota decimal (2,1),
ativo boolean,

primary key (id)
);

#Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
#atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.

use db_empresa;

create table tb_funcionarios(
	id bigint(5) auto_increment,
	nome varchar(25) not null,
    area varchar (50) not null,
    salario decimal (10,2),
    ativo boolean,
    
    primary key (id)
);

select * from tb_funcionarios
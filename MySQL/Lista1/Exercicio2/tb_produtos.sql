#Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
#relevantes dos produtos para se trabalhar com o serviço deste ecommerce.

use db_ecommerce;

create table tb_produtos (
id bigint (5) auto_increment,
produto varchar(50) not null,
valor decimal(10,2),
estoque int,
ativo boolean,

Primary key (id)
)

select * from tb_produtos
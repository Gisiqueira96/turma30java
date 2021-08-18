#Ao término atualize um dado desta tabela através de uma query de atualização.

use db_ecommerce;

update tb_produtos set estoque = 30
	where id = 3;
    
select * from tb_produtos
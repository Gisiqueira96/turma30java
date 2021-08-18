#Ao término atualize um dado desta tabela através de uma query de atualização.

use db_empresa;

update tb_funcionarios set area = "Contabilidade"
	where id = 1;
    
    select * from tb_funcionarios
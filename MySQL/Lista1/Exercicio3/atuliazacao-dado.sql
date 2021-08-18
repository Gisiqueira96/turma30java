#Ao término atualize um dado desta tabela através de uma query de atualização.

use db_escola;

update tb_alunos set nota = 5
	where id = 5;
    
select * from tb_alunos
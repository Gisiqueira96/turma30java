#Popule esta tabela com até 5 dados;

use db_empresa;

insert tb_funcionarios (nome, area, salario)
	value ("Carlos", "contabilidade", 2500.46);
insert tb_funcionarios (nome, area, salario)
	value ("Agatha", "Gerente", 5123.63);
insert tb_funcionarios (nome, area, salario)
	value ("Beatriz", "Secretrária", 1960.38);
insert tb_funcionarios (nome, area, salario)
	value ("João Paulo", "Auxiliar de Contabilidade", 1910.24);
insert tb_funcionarios (nome, area, salario)
	value ("Bruno", "Produção", 1984.23);
    
select * from tb_funcionarios
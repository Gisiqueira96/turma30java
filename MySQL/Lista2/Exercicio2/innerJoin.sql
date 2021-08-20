#Faça um um select com Inner join entre  tabela categoria e pizza.

use db_pizzaria_legal;

select * from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
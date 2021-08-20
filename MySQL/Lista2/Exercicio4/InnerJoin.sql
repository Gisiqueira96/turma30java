#Faça um um select com Inner join entre  tabela categoria e produto.

use db_cidade_das_frutas;

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
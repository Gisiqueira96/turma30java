#Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).

use db_pizzaria_legal;

select tb_pizza.sabor, tb_pizza.valor, tb_categoria.tipo from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
		where tb_categoria.tipo = "Doce"
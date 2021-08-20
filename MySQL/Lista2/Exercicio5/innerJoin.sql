#Faça um um select com Inner join entre  tabela categoria e produto.

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    order by tb_produto.id_produto desc;
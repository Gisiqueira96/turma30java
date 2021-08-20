#Faça um select onde traga todos os Produtos de uma categoria específica 
#(exemplo todos os produtos que são da categoria hidráulica).

select tb_produto.nome, tb_produto.valor, tb_categoria.categoria from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
		where tb_categoria.categoria = "Hidraulica"
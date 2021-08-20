#Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java).

select tb_curso.nome, tb_curso.valor, tb_categoria.tipo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id
		where tb_categoria.tipo = "Front-end"
#Faça um um select com Inner join entre  tabela categoria e produto.

select * from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id
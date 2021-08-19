use db_estoque;

select * from tb_produtos
left join tb_marcas on tb_marcas.id = tb_produtos.marca_id
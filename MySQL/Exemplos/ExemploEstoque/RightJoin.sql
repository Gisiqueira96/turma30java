use db_estoque;

select * from tb_produtos
right join tb_marcas on tb_marcas.id = tb_produtos.marca_id;
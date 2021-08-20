use db_construindo_a_nossa_vida;

#Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (categoria, corredor) value ("Construção", 1);
insert into tb_categoria (categoria, corredor) value ("Hidraulica", 3);
insert into tb_categoria (categoria, corredor) value ("Elétrica", 6);
insert into tb_categoria (categoria, corredor) value ("Pintura", 7);
insert into tb_categoria (categoria, corredor) value ("Outros", 10);
select * from tb_categoria;

#Popule esta tabela Produto com até 8 dados.

insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Lâmpada", 21.99, 50, 'S', 3);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Glão de Tinta", 89.89, 20, 'S', 4);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Cimento", 15.98, 32, 'S', 1);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Toneira", 32.98, 10, 'S', 2);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Varal", 59.99, 8, 'S', 5);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Chuveiro", 63.99, 16, 'S', 2);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Kit pinceis", 16.98, 15, 'S', 4);
insert into tb_produto (nome, valor, estoque, ativo, categoria_id) value ("Gesso", 20.98, 30, 'S', 1);
select * from tb_produto;
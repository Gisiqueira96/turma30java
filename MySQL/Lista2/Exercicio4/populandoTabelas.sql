use db_cidade_das_frutas;

#Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (tipo, nasce) value ("Fruta", "Árvore");
insert into tb_categoria (tipo, nasce) value ("Fruta", "Arbusto");
insert into tb_categoria (tipo, nasce) value ("Fruta", "Terra");
insert into tb_categoria (tipo, nasce) value ("Legumes", "Terra");
insert into tb_categoria (tipo, nasce) value ("Verdura", "Terra");

select * from tb_categoria;

#Popule esta tabela Produto com até 8 dados.

insert into tb_produto (nome, valor, peso, categoria_id) value ("Abacaxi", 5.99, 1.6, 3);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Maça", 1.99, 0.5, 1);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Cenoura", 4.99, 1.6, 4);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Melancia", 51.99, 10, 3);
insert into tb_produto (nome, valor, peso, categoria_id) value ("bluberry", 21.99, 0.01, 2);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Alface", 3.99, 0.3, 5);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Amora", 8.98, 0.01, 2);
insert into tb_produto (nome, valor, peso, categoria_id) value ("Couve", 2.5, 0.4, 5);
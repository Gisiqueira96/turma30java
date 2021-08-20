#Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (tipo, receita) value ("Medicamento", 'S');
insert into tb_categoria (tipo, receita) value ("Medicamento", 'N');
insert into tb_categoria (tipo, receita) value ("Higiene", 'S');
insert into tb_categoria (tipo, receita) value ("Higiene", 'N');
insert into tb_categoria (tipo, receita) value ("Alimento", 'N');

#Popule esta tabela Produto com até 8 dados.

insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Buscopan", 5.99, 10, 2);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Roacutan", 129.92, 30, 1);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Gilette", 80.98, 6, 4);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Monster", 8.50, 1, 5);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Neosaldina", 15.95, 10, 2);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Sabonete liquido", 30.49, 1, 4);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("enxaguante", 62.85, 1, 4);
insert into tb_produto (nome, valor, quantidade, categoria_id) value ("Metiformina", 26.98, 30, 1);
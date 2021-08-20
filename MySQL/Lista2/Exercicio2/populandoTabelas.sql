

use db_pizzaria_legal;

# Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (tipo, tamanho) value ("Salgada", 'P');
insert into tb_categoria (tipo, tamanho) value ("Salgada", 'M');
insert into tb_categoria (tipo, tamanho) value ("Salgada", 'G');
insert into tb_categoria (tipo, tamanho) value ("Doce", 'P');
insert into tb_categoria (tipo, tamanho) value ("Doce", 'M');

select * from tb_categoria;

#Popule esta tabela pizza com até 8 dados.

insert tb_pizza (sabor, valor, borda, categoria_id) value ("Maracatu", 41.99, 'S', 3);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Catupireza", 52.98, 'S', 2);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Oreo", 32.56, 'N', 4);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Moranguete", 36.89, 'N', 5);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Portuguesa", 44.99, 'S', 1);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Banaca D/ canela", 28.89, 'N', 5);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Moda da Dasa", 49.98, 'S', 3);
insert tb_pizza (sabor, valor, borda, categoria_id) value ("Banana C/ Chocolate", 26.98, 'N', 4);

select * from tb_pizza;


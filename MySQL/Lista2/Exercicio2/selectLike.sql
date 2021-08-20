#Faça um select  utilizando LIKE buscando os Produtos com a letra C.

use db_pizzaria_legal;

select * from tb_pizza where sabor like "%C%"
#Popule esta tabela com até 8 dados;

use db_ecommerce;

insert tb_produtos (produto, valor, estoque)
	value ("Porta", 250.99, 50);
insert tb_produtos (produto, valor, estoque)
	value ("Tinta Galão", 600.89, 25);
insert tb_produtos (produto, valor, estoque)
	value ("Luminária", 150.79, 10);
insert tb_produtos (produto, valor, estoque)
	value ("Lâmpada Led", 29.49, 150);
insert tb_produtos (produto, valor, estoque)
	value ("Kit Pincel", 89.99, 30);
insert tb_produtos (produto, valor, estoque)
	value ("Furadeira", 507.49, 16);
insert tb_produtos (produto, valor, estoque)
	value ("Parafusadeira", 500.99, 50);
insert tb_produtos (produto, valor, estoque)
	value ("Campainha", 63.48, 36);
    
select * from tb_produtos
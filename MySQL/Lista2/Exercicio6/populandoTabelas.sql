#Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (professor, tipo) value ("Marcelo", "Back-end");
insert into tb_categoria (professor, tipo) value ("Ednilson", "Back-end");
insert into tb_categoria (professor, tipo) value ("Michelle", "Back-end");
insert into tb_categoria (professor, tipo) value ("Thiago", "Front-end");
insert into tb_categoria (professor, tipo) value ("Fábio", "Front-end");

select * from tb_categoria;

#Popule esta tabela Produto com até 8 dados.

insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("Java", 299.98, 90, 2);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("Angular", 49.99, 30, 4);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("SQL", 150.69 , 60, 3);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("Portugol", 45.99, 20, 1);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("JavaScript", 139.98, 90, 5);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("Spring Boot", 159.99, 30, 1);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("TypeScript", 55.98, 30, 5);
insert into tb_curso (nome, valor, tempo_dias, categoria_id) value ("Postman", 46.99, 25, 1);

select * from tb_curso;
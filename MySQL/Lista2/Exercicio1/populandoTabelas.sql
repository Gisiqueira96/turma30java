use db_generation_game_online;

# Popule esta tabela classe com até 5 dados.

insert into tb_classe (carater, tipos) value ("bondoso", "policial");
insert into tb_classe (carater, tipos) value ("maldoso", "bandido");
insert into tb_classe (carater, tipos) value ("bondoso", "heroi");
insert into tb_classe (carater, tipos) value ("maldoso", "assassino");
insert into tb_classe (carater, tipos) value ("bondoso", "medico");

select * from tb_classe;


#Popule esta tabela personagem com até 8 dados.
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Caract", 5000, 2500, 2);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Marc", 900, 6000, 5);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Jant", 4300, 1000, 2);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Purk", 6400, 4000, 4);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Carl", 5600, 1500, 1);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Gordon", 1200, 1000, 2);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Sents", 6000, 5000, 3);
insert into tb_personagem (nome, poderataque, poderdefesa, classe_id ) value ("Amarcon", 1900, 6000, 3);

select * from tb_personagem;


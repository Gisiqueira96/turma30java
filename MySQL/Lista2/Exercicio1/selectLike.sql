#Faça um select  utilizando LIKE buscando os personagens com a letra C.

use db_generation_game_online;

select * from tb_personagem where nome like "%C%";
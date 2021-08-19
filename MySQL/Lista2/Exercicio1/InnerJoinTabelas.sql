# Faça um um select com Inner join entre  tabela classe e personagem.

use db_generation_game_online;

select * from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.classe_id
#Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).

use db_generation_game_online;

select tb_personagem.nome, tb_classe.carater, tb_classe.tipos from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.classe_id
    where tb_classe.carater = "bondoso"
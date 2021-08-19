#Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.

use db_generation_game_online;

select * from tb_personagem where poderdefesa between 1000 and 2000;
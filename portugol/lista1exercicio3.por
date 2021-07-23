programa
{
	
	funcao inicio()
	{
		/*
		 * 3.Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		 */

			// 1 hora - 3600 seg
			// 1 min - 60 seg
			// 1 seg - 1 seg

		inteiro hora
		inteiro min
		inteiro seg
		inteiro total_seg

		escreva ("Digita o tempo em segundos: ")
		leia (total_seg)

		hora = total_seg / 3600
		min = (total_seg % 3600) / 60
		seg = (total_seg % 3600) % 60

		escreva ("O total de " + hora + " horas " + min + " minutos " + seg + " segundos.")

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
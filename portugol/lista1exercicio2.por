programa
{
	
	funcao inicio()
	{

		/*
		 * 2.Faça um sistema que leia a idade de uma pessoa expressa 
		 * em dias e mostre-a expressa em anos, meses e dias.
		 */

		 	// 1 ano - 365 dias
		 	// 1 mes - 30 dias
		 	// 1 dia - 1 dia
		 	
		inteiro anos 
		inteiro meses
		inteiro dias
		inteiro total_dias

		
		escreva ("Digite idade em dias: ")
		leia (total_dias)

		anos = total_dias / 365
		meses = (total_dias % 365) / 30
		dias = (total_dias % 365) % 30

		escreva ("\nVocê possuí " + anos + " anos, " + meses + " meses e " + dias + " dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
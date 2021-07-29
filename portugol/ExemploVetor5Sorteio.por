programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Loteria - variação de numeros para a loteria
		 */
		 inteiro jogadas[6]

		 para(inteiro x=0 ; x<6 ; x++){
		 	jogadas[x] = Util.sorteia(1,60)
		 }
		 escreva ("Mostrando os valores!! \n")
		 para(inteiro x=0 ; x<6 ; x++){
		 	escreva ("Lançamento " , x+1, " - " , jogadas[x] , "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {jogadas, 10, 11, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
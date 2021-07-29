programa
{
	
	funcao inicio()
	{
		/*VETOR
		 *1) Faça um programa que crie um vetor por leitura com 5 
		 *valores de pontuação de uma atividade e o escreva em 
		 *seguida. Encontre após a maior pontuação e a apresente.
		 */

		inteiro pontos[5]
		inteiro maiorPonto = 0
		
		 para (inteiro v=0 ; v<5 ; v++){
		 	escreva ("Digite a pontuação: ")
		 	leia (pontos[v])
		 	se (pontos[v] > maiorPonto){
		 		maiorPonto = pontos[v]
		 	}
		 }
		 escreva ("\nA maior pontuação é: " , maiorPonto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
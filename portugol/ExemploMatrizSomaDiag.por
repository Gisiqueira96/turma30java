programa
{
	
	funcao inicio()
	{
		/*
		 * Exemplo matriz1
		 * soma diagonal principal.
		 */

		inteiro matriz1[2][2]
		inteiro matriz2[2][2]

		 matriz1[0][0] = 10
		 matriz1[0][1] = 20
		 matriz1[1][0] = 30
		 matriz1[1][1] = 10

		 matriz2[0][0] = 20
		 matriz2[0][1] = 40
		 matriz2[1][0] = 10
		 matriz2[1][1] = 50

		inteiro diagonalPrincipal = 0
		
		 //escreva (matriz1[0][0] + "\n")
		 //escreva (matriz1[0][1] + "\n")
		 //escreva (matriz1[1][0] + "\n")
		 //escreva (matriz1[1][1] + "\n")

		 para (inteiro l=0 ; l<2 ; l++){
		 	para (inteiro c=0 ; c<2 ; c++){
		 		escreva (matriz1[l][c]+"\n")
		 		se (l == c){
		 			diagonalPrincipal += matriz1[l][c]
		 		} 
		 	}
		 }
		 escreva ("Soma dos valores da diagonal principal: ", diagonalPrincipal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
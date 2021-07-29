programa
{
	
	funcao inicio()
	{
		/*
		 * Exemplo matriz1 e matriz2
		 * que a matriz 2 tenha o dobro do valor da matriz1
		 */

		inteiro matriz1[2][2]
		inteiro matriz2[2][2]

		 matriz1[0][0] = 10
		 matriz1[0][1] = 20
		 matriz1[1][0] = 30
		 matriz1[1][1] = 10

		

		inteiro diagonalPrincipal = 0
		
		 //escreva (matriz1[0][0] + "\n")
		 //escreva (matriz1[0][1] + "\n")
		 //escreva (matriz1[1][0] + "\n")
		 //escreva (matriz1[1][1] + "\n")

		 para (inteiro l=0 ; l<2 ; l++){
		 	para (inteiro c=0 ; c<2 ; c++){
		 		escreva (matriz1[l][c] + " " + "\n")
		 		se (l == c){
		 			diagonalPrincipal += matriz1[l][c]
		 		} 
		 	}
		 	escreva ("\n")
		 }
		 escreva ("Soma dos valores da diagonal principal: ", diagonalPrincipal , "\n")

		 para (inteiro l=0 ; l<2 ; l++){
			para(inteiro c=0 ; c<2 ; c++){
				matriz2[l][c] = matriz1[l][c] * 2
				escreva (matriz2[l][c] + " ")
			}
			escreva ("\n")
		 }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
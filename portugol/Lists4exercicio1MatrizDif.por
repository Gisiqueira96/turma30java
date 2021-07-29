programa
{
	
	funcao inicio()
	{
		/*MATRIZ
		 *1) Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos 
		elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos 
		elementos de mesma posição das matrizes N1 e N2.
		*/

		 const inteiro L=2 , C=2
		 inteiro n1 [L][C] , n2 [L][C] , m1 [L][C] , m2 [L][C]
		 inteiro soma , diferenca

		 	para(inteiro l=0 ; l<L ; l++){
		 		para(inteiro c=0 ; c<C ; c++){
		 			escreva ("Digite o valor de n1 [" , l , "] [", c ,"] =")
		 			leia (n1 [l][c])
		 			
		 			escreva ("Digite o valor de n2 [" , l , "] [", c ,"] =")
		 			leia (n2 [l][c])
					

					soma = n1 [l][c] + n2 [l][c]
						m1 [l][c] = soma
					diferenca = n1 [l][c] - n2 [l][c]
						m2 [l][c] = diferenca
		 		}
		 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 15, 12, 2}-{n2, 15, 24, 2}-{m1, 15, 36, 2}-{m2, 15, 48, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
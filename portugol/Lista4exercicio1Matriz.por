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
		const inteiro L=4 , C=6
		inteiro matriz1 [L] [C]
		inteiro matriz2 [L] [C] 
		inteiro m1 [L] [C]
		inteiro m2 [L] [C]

			para (inteiro l=0 ; l<L ; l++){
				para (inteiro c=0 ; c<C ; c++){
					escreva ("Digite o número da matriz1 [" ,l, "] [" ,c, "] = ")
					leia (matriz1[l][c])
				}
			}
			
			para (inteiro l=0 ; l<L ; l++){
				para (inteiro c=0 ; c<C ; c++){
					escreva ("Digite o número da matriz2 [" ,l, "] [" ,c, "] = ")
					leia (matriz2[l][c])
				}
			}
			para (inteiro l=0 ; l<L ; l++){
				para (inteiro c=0 ; c<C ; c++){
					m1 [l][c] = matriz1[l][c] + matriz2[l][c]
				}
			}
			para (inteiro l=0 ; l<L ; l++){
				para (inteiro c=0 ; c<C ; c++){
					m2 [l][c] = matriz1[l][c] - matriz2[l][c]
				}
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1083; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 14, 10, 7}-{matriz2, 15, 10, 7}-{m1, 16, 10, 2}-{m2, 17, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
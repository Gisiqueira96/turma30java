programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
	/*
	 * 3)Desenvolva um sistema em que:
		•Leia 4 (quatro) números;
		•Calcule o quadrado de cada um;
		•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		•Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	 */
	 real num1, num2, num3, num4
	 real quad1, quad2, quad3, quad4
	 
		escreva("Escreva o valor atribuido para o número 1: ")
		leia (num1)
		escreva("Escreva o valor atribuido para o número 2: ")
		leia (num2)
		escreva("Escreva o valor atribuido para o número 3: ")
		leia (num3)
		escreva("Escreva o valor atribuido para o número 4: ")
		leia (num4)

		limpa()
		quad1 = Mat.potencia(num1,2)
		quad2 = Mat.potencia(num2,2)
		quad3 = Mat.potencia(num3,2)
		quad4 = Mat.potencia(num4,2)
		
		se (quad3 >= 1000){
			escreva ("\nNúmero 3: ", num3)
			escreva ("\nQuadrado número 3: " , quad3)
		}
		senao {
			escreva ("Número 1: ", num1)
			escreva ("\nQuadrado número 1: " , quad1)
			escreva ("\nNúmero 2: ", num2)
			escreva ("\nQuadrado número 2: " , quad2)
			escreva ("\nNúmero 3: ", num3)
			escreva ("\nQuadrado número 3: " , quad3)
			escreva ("\nNúmero 4: ", num4)
			escreva ("\nQuadrado número 4: " , quad4)
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
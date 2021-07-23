programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 4. Escreva  um sistema que leia três números inteiros e 
		 * positivos (A, B, C) e calcule a seguinte expressão: 
		 * D = (R + S) / S ,  
		 * onde: R = (A + B)²
		 * 	    S = (B + C)²	
		*/
		
		real A, B, C, D, R, S, R1, S1

		escreva ("Digite o valor de A: ")
		leia (A)
		escreva ("Digite o valor de B: ")
		leia (B)
		escreva ("Digite o valor de C: ")
		leia (C)
		
		R= (A + B)  
		S= (B + C) 
		R1 = mat.potencia (R, 2)
		S1 = mat.potencia (S, 2)

		D= (R1 + S1)/2

		escreva ("Resultado igual a: " + D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		/*
		 *5. Faça um sistema que leia as 3 notas de um aluno e calcule 
		 *a média final deste aluno. Considerar que a média é ponderada 
		 *e que o peso das notas é: 2,3 e 5, respectivamente.  
		*/
		
		real A, B, C, M

		escreva ("Valor da nota A: ")
		leia (A)
		escreva ("Valor da nota B: ")
		leia (B)
		escreva ("Valor da nota C: ")
		leia (C)

		M= ((A*2) + (B*3) + (C*5)) / (2 + 3 + 5)

		escreva ("Média final do aluno:" + M)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
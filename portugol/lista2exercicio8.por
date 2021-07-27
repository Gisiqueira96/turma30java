programa
{
	
	funcao inicio()
	{
	/*
	 * 8)Construa um sistema para ler uma variável numérica N e 
	 * imprimi-la somente se a mesma for maior que 100, caso 
	 * contrário imprimi-la com o valor zero.
	 */

	real numero
	const inteiro zero = 0
	 
		escreva("Digite o valor numérico: ")
		leia (numero)
		
		se (numero > 100){
			escreva ("A variável é: " , numero , ".")
		}
		senao{
			escreva ("A variável é: " , zero , ".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
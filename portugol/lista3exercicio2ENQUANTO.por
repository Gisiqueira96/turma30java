programa
{
	
	funcao inicio()
	{
	/*ENQUANTO
	 * 2- Obtenha um número digitado pelo usuário e repita a operação 
	 * de multiplicar ele por três  (imprimindo o novo valor) até que 
	 * ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos 
	 * observar na tela a seguinte sequência: 5 15 45 135.
	 */

		inteiro numero = 0
		inteiro multi = 0

		escreva ("Digite um numero: ")
		leia (numero)
		escreva ("\nValores: " ,numero)
		
		enquanto (numero < 100){
				multi = numero * 3
				numero = multi
			escreva ("\nValores: ", numero)	
					
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
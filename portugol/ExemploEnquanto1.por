programa
{
	
	funcao inicio()
	{
	//com caracter
		inteiro numero = 0
		inteiro total = 0
		caracter op ='S' // fuga

		enquanto (op =='S'ou op=='s'){
			escreva ("Digite o numero: ")
			leia (numero)
			total += numero
			escreva("Continua sim ou não [S/N]: ")
			leia (op)
		}
		escreva ("\nO total é: " , total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
	/*
	 * 4)Faça um sistema que leia um número inteiro e mostre uma mensagem 
	 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
	 */
	 
	 inteiro num
		escreva("Digite um valor inteiro: ")
		leia (num)

		se (num % 2 == 0){
			escreva ("O valor " , num , " é par")
		}
		senao {
			escreva ("\nO valor " , num , " é impar")
		}
		se (num < 0){
			escreva ("\nO valor " , num , " é negativo")
		}
		senao {
			escreva ("\nO valor " , num , " é positivo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
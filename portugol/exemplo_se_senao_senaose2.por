programa
{
	
	funcao inicio()
	{
	inteiro num
	
		escreva("Digite um numero inteiro: ")
		leia (num)


		se (num == 0){
			escreva ("O valor é neutro!")	
		}
		se (num < 0){
			escreva ("O valor é negativo, digite um valor positivo!")
		}
		senao se (num % 2 == 1){
			escreva ("O Número " , num , " é impar.")
		}
		senao {
			escreva ("O Número " , num , " é par.")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
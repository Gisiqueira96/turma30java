programa
{
	
	funcao inicio()
	{

		inteiro total = 0
		inteiro numero = 0
		real media = 0
		inteiro maiorValor = 0
		
		para (inteiro x=1 ; x<=5 ; x++){
			//totalizar
			escreva ("Digite um número: ")
			leia (numero)
			total += numero
			se (numero > maiorValor)
				maiorValor = numero
		}
		media = total / 5
		escreva ("O total é: ", total)
		escreva ("\nA média é: ", media)
		escreva ("\nO maior valor é: ", maiorValor)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
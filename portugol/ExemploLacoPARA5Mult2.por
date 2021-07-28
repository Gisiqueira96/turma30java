programa
{
	
	funcao inicio()
	{

		// 1 - 100
		//somar quando for multiplo de 3, juntando 
		//em um total de multiplos de 3

			inteiro totalMultiplos = 0
	
			para (inteiro x=1 ; x<=100 ; x++){
				
				se ((x%3)==0 e (x%2)==1){
					escreva (" x " , x , " + " , totalMultiplos , " = ")
					totalMultiplos += x
					escreva (totalMultiplos, "\n")
				} 
			}
			
			escreva ("O total dos valores é: " ,totalMultiplos)
	}
	funcao linha(inteiro tamanho){
		para(inteiro x=1 ; x<=tamanho ; x++){
			escreva ("-")	
		}
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
	//100 - 200
	// multiplos de 4
	//faço isso de 100 até 200
		inteiro totalMultiplos4 = 0
		inteiro totalMultiplos7Impares = 0

		
			para (inteiro x=1 ; x<=1000 ; x++){
				se (x>=100 e x<=200 e (x%4)==0){
					totalMultiplos4 += x	 
			}

				se (x>=400 e (x%2)==1 e (x%7)==0){
					totalMultiplos7Impares += x
			}
		}
		escreva("Total multiplos de 4 entre 100 e 200 = " ,totalMultiplos4)
		escreva("\nTotal impares multiplos de 7 entre 400 e 1000: " , totalMultiplos7Impares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
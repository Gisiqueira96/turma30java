programa
{
	
	funcao inicio()
	{
		inteiro tamanho
		escreva ("Digite o tamanho da linnha: ")
		leia (tamanho)
	
		para (inteiro x=1 ; x<=10; x++){
			escreva (x , " Bom dia!!\n")	
		}
		
		linha (tamanho)
		escreva ("\n")
		
		para (inteiro x=10 ; x>=1 ; x--){
			escreva (x , "Até Logo!!\n")
		}
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
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
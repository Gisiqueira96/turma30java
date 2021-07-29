programa
{
	
	funcao inicio()
	{

		cadeia times[4] //tamanho 4 = 0 - 3
		inteiro pontos [] = {10,20,15,7}

		times [0] = "PALMEIRAS"
		times [1] = "SPFC"
		times [2] = "CORINTHIANS"
		times [3] = "SANTOS"

		// varer o vetor, pois vai do 0 até o 3
		escreva ("Nome dos times \n")
		para (inteiro indice = 0 ; indice < 4 ; indice++){
			escreva ( + times[indice] + " " + pontos[indice] + "\n")

		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
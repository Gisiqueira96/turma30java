programa
{
	
	funcao inicio()
	{
	//1-100
	// se o numero for multiplo de 3 eu pego ele e somo ele ao total de multtiplos de 3
	//faço isso até 100
	inteiro total = 0

	para (inteiro x=1 ; x<=100 ; x++){
		se ((x%3) == 0 e (x%2) == 1){
			escreva ("x= " , x ," + o total " , total , " = ")
			total += x
			escreva (total, "\n")
		}
		//total = total + x //totalizador - didatico
		//total += x //totalizador - prog
	escreva ("\nx= " , x ," + o total " , total , " = ")
	}
	escreva ("O total dos valores é: " , total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
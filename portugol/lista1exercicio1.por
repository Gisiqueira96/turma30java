programa
{
	
	funcao inicio()
	{
		/*
		 *1.	Faça um sistema que leia a idade de uma pessoa expressa 
		 *em anos, meses e dias e mostre-a expressa apenas em dias.  
		*/
		inteiro anos 
		inteiro meses
		inteiro dias
		inteiro total_dias


		escreva ("Digite os Anos: ")
		leia (anos)
		escreva ("Digite os Meses: ")
		leia (meses)
		escreva ("Digite os Dias: ")
		leia (dias)

		total_dias = (dias + (anos * 365) + (meses * 30))

		escreva ("\nSua idade em dias é: " + total_dias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
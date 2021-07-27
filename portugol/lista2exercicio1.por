programa
{
	
	funcao inicio()
	{
		/*
		 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento 
		 * diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido 
		 * pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por 
		 * quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de 
		 * tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
		 * variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais 
		 * variáveis com o conteúdo ZERO.
		 */

		 inteiro peso_tomates
		 inteiro excesso
		 inteiro multa

		escreva ("Digite o peso do tomate: ")
		leia (peso_tomates)

		excesso = peso_tomates - 50
		multa = (excesso * 4)
		
		 se (peso_tomates <= 50){
		 	escreva ("Peso total: " , peso_tomates , ".")
		 	escreva ("\nEstá dentro do peso estabelcido!")
			escreva ("\nPeso de excesso: " , excesso , ".")	
			escreva ("\nDeverá ser pago o valor de " , multa , " de multa.")
		 }
		 se (peso_tomates > 50){
		 	escreva ("Peso total: " , peso_tomates , ".")
		 	escreva ("\nNão está dentro do peso estabelcido!")
			escreva ("\nPeso de excesso: " , excesso , ".")	
			escreva ("\nDeverá ser pago o valor de " , multa , " de multa.")		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
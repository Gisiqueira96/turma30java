programa
{
	
	funcao inicio()
	{
		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
		 * com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 */

		 real custo_fabrica
		 real custo_distribuicao
		 real impostos
		 real custo_consumidor

		 escreva ("Digite o custo de fábrica do automóvel: ")
		 leia (custo_fabrica)

		 custo_distribuicao = custo_fabrica * 0.28
		 escreva ("\nA percentagem do distribuidor é: " + custo_distribuicao)

		 impostos = custo_fabrica * 0.45
		 escreva ("\nA percentagem de impostos é: " + impostos)

		 custo_consumidor = custo_fabrica + custo_distribuicao + impostos
		 escreva ("\nCusto total ao consumidor é: " + custo_consumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 819; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
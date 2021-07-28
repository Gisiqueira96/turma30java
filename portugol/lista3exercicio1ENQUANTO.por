programa
{
	
	funcao inicio()
	{
	/*ENQUANTO
	 * 1- Elaborar um programa que efetue a leitura sucessiva de 
	 * valores numéricos e apresente no final o total do somatório, 
	 * a média e o total de valores lidos. O programa deve fazer as 
	 * leituras dos valores enquanto o usuário estiver fornecendo 
	 * valores positivos. Ou seja, o programa deve parar quando o 
	 * usuário fornecer um valor negativo.
	 */
		real num
		real soma = 0.0
		real media 
		inteiro contador = 0

		escreva ("Digite um número: ")
			leia (num)
			
		enquanto (num >= 0){
			soma += num
			contador += 1
			escreva ("Digite um número: ")
			leia (num)
			
		}
		media = soma / contador
		
		escreva ("A soma dos valores: ", soma)
		escreva ("\nA média dos valores: ", media)
		escreva ("\nTotal de valores lidos: ", contador)
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
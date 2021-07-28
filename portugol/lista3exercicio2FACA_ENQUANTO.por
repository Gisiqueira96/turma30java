programa
{
	
	funcao inicio()
	{
	/*FAÇA..ENQUANTO
	 * 2- Faça um programa que pegue um número do teclado e calcule a 
	 * soma de todos os números  de 1 até ele. Ex.: o usuário entra 7, 
	 * o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	 */
		//VARIAVEIS
		inteiro numero = 0
		inteiro totalNumeros = 0
		inteiro contadorNumeros = 0 
		
		
		escreva ("Digite um número positivo acima de 1: ")
		leia (numero)
		
		faca {
			contadorNumeros++
			totalNumeros += contadorNumeros
			se (contadorNumeros == 1){
				escreva (contadorNumeros)
			}
			senao{
				escreva (" + " , contadorNumeros)	
			}
		}enquanto (contadorNumeros < numero )
			escreva (" = ", totalNumeros)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
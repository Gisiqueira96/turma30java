programa
{
	
	funcao inicio()
	{
		/*VETOR
		 * 2) Um dado é lançado 10 vezes e o valor correspondente 
		 * é anotado. Faça um programa que gere um vetor com os 
		 * lançamentos, escreva esse vetor. A seguir determine e imprima 
		 * a média aritmética dos lançamentos, contabilize e apresente 
		 * também quantas foram as ocorrências da maior pontuação.
		 */

		inteiro jogadas [10]
		const inteiro jogo = 10
		real media = 0.0
		inteiro maiorPonto = 0
		inteiro total = 0

		para (inteiro j=0 ; j<jogo ; j++){
		 	escreva ("O valor do dado é: ")
		 	leia (jogadas[j])
		 }
		escreva ("Mostrando os valores!!\n")
		para (inteiro j=0 ; j<jogo ; j++){
		 	escreva ("Lançamento" , " " , j+1 ," - " , jogadas[j] , "\n")

		 	total += jogadas[j]
		 	se ( jogadas[j] > maiorPonto){
		 		maiorPonto = jogadas[j]
		 	}
		}
		 media = total / jogo
		 escreva ("O total é: " , total , "\n")
		 escreva ("A média é: " , media , "\n")
		 escreva ("O maior ponto é: " , maiorPonto , "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
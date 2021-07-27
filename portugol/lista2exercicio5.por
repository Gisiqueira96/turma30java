programa
{
	
	funcao inicio()
	{
	/*
	 * 5)A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
	 * 3 grupos de indústrias que são altamente poluentes do meio ambiente. O 
	 * índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 
	 * 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se 
	 * o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a 
	 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser 
	 * notificados a paralisarem suas atividades. Faça um sistema que leia o índice 
	 * de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.7
	 * índice total = 0.05 à 0.25
	 * 1º - acima de 0.30
	 * 2º - acima de 0.40
	 * 3º - acima de 0.50
	 */

	 	real indiceAtual
	 	
		escreva("Digite o índice de poluição atual: ")
		leia (indiceAtual)
		
		se (indiceAtual >= 0.3 e indiceAtual < 0.4){
			escreva ("As industrias do 1º grupo deverão suspender as atividades.")
		}
		se (indiceAtual >= 0.4 e indiceAtual < 0.5){
			escreva ("As industrias do 1º e 2º grupo deverão suspender as atividades.")
		}
		se (indiceAtual >= 0.5){
			escreva ("Todas as industrias deverão suspender as atividades.")
		}
		se (indiceAtual < 0.3){
			escreva ("Todas as industrias podem funcionar normalmente.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
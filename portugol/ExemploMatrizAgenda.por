programa
{
	
	funcao inicio()
	{
		/*
		 * Exemplo matriz agenda 
		 */

		 cadeia agenda[24][31] //linha = hora e coluna = dia
		 caracter op = 'S'
		 inteiro dia, hora

		 faca {
			escreva("Digite o dia do evento: ")
			leia (dia)
			dia --
			escreva ("Digite a hora do evento: ")
			leia (hora)
			escreva ("Digite o agendamento: ")
			leia (agenda[hora][dia])
			escreva ("Continua S/N: ")
			leia (op)
		 	
		 } enquanto (op=='S' ou op=='s')

		 para(inteiro l=0 ; l<24 ; l++){
		 	para (inteiro c=0 ; c<31 ; c++){
		 		se (agenda [l][c] != ""){
		 			escreva ("Dia ", c+1, " hora ", l , "hrs evento: " ,agenda [l][c], "\n")	
		 		}
		 	}
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {agenda, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
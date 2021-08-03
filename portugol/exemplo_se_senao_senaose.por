programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		inteiro anoNascimento
		const inteiro ANOATUAL = 2021
		caracter vocativo
			
		
		escreva("Digite seu nome: ")
		leia (nome)
		escreva ("Digite como prefere ser identificade - O/A/E: ")
		leia (vocativo)
		escreva("Digote ano de nascimento: ")
		leia(anoNascimento)
		
		idade = ANOATUAL - anoNascimento

		se (idade >= 45){
			se (vocativo == 'O' ou vocativo == 'o'){
				escreva("\nOi Sr " , nome , " sua idade é " , idade , " você é cringe.")
			}
			
		}
	
		senao se (idade <= 16){
				escreva("\nOi, " , nome , " sua idade é " , idade , " você é infanto-juvenil.")
		}
		senao se (idade < 18){
				escreva("\nOi, " , nome , " sua idade é " , idade , " você é adolescente.")	
		}
		senao {
			escreva("\nOi, " , nome , " sua idade é " , idade , " você não é cringe.")
		}
		escreva ("\nFIM DE PROGRAMA")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
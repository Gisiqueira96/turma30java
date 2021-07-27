programa
{
	
	funcao inicio()
	{
	/*
	 * 2)Elabore um sistema que leia as variáveis C e N, respectivamente código 
	 * e número de horas trabalhadas de um operário. E calcule o salário sabendo-se 
	 * que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule 
	 * o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal 
	 * variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
	 * imprimir o salário total e o salário excedente.
	 */

	inteiro codigo
	inteiro numero_de_horas
	real salario
	real excesso = 0.00
	real salario_Total = 0.00
	const real VALOR_HORA = 10.00
	const real VALOR_HORA_EX = 20.00
	const inteiro LIMITE_HORAS = 50
	 
		escreva ("Digite o código do funcionário: ")
		leia (codigo)
		escreva ("Digite as horas trabalhadas pelo funcionário: ")
		leia (numero_de_horas)


		se (numero_de_horas <= LIMITE_HORAS){
			salario = numero_de_horas * VALOR_HORA
			excesso = (numero_de_horas - LIMITE_HORAS) * VALOR_HORA_EX
			salario_Total = excesso + 500
				escreva ("Salário do funcionário: R$ " , salario , ".")
				escreva ("\nValor da hora extra: R$ " , excesso , ".")
				escreva ("\nSalário total: R$ " , salario_Total , ".")
		}
			
		senao {
			salario = LIMITE_HORAS * VALOR_HORA
			excesso = (numero_de_horas - LIMITE_HORAS) * VALOR_HORA_EX
			salario_Total = excesso + 500
				escreva ("Salário do funcionário: R$ " , salario , ".")
				escreva ("\nValor do salário excedente: R$ " , excesso, ".")
				escreva ("\nSalário total: R$ " , salario_Total , ".")
			}
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
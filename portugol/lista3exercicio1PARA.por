programa
{
	
	funcao inicio()
	{
	/*PARA
	* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	* coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; *
	b) média do número de filhos; *
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.  x<= 100    x*100
	 */

	 		//VARIAVEIS
	 		const inteiro HAB = 3
	 		real salario = 0.00
	 		inteiro filhos = 0
	 		real totalSalarios = 0.00 , mediaSalario = 0.00
	 		real totalFilhos = 0.00 , mediaFilhos = 0.00
	 		real percentualSalario100 = 0.00 , contadorSalarioAte100 = 0.00
	 		real maiorSalario = 0.00
	 		
	 		//ENTRADAS
	 		para (inteiro x=1 ; x<=HAB ; x++){
		 		escreva("Digite o salário R$ ")
		 		leia (salario)
		 		escreva ("Número de filhos ")
		 		leia (filhos)

		 		se ( salario > maiorSalario){
					maiorSalario = salario
				}
				se (salario <= 100.00){
					contadorSalarioAte100++
				}
		 		//PROCESSAMENTOS
		 		totalSalarios += salario
		 		mediaSalario = (totalSalarios/HAB)

				totalFilhos += filhos
				mediaFilhos = (totalFilhos/HAB)
				percentualSalario100 = (contadorSalarioAte100/HAB)*100
				
			}
			
	 		//SAIDAS
	 		escreva ("Total salarial: R$ " , totalSalarios)
	 		escreva ("\nMédia salarial: R$ " , mediaSalario)

	 		escreva ("\nTotal de filhos: " , totalFilhos)
	 		escreva ("\nMédia de filhos: " , mediaFilhos)

	 		escreva ("\nMaior salário: " , maiorSalario)

	 		
	 		escreva ("\nPercentual até R$100.00 de salário: " , percentualSalario100 , "%")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
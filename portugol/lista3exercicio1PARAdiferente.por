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

		inteiro hab
		real salario,salarioTotal = 0, mediaSalario, mediaFilhos, salarioAte100 =0
		inteiro filhos, filhosTotal=0
		real maiorSalario = 0, porcentagemSalario=0
		
		
		 para (hab=1 ; hab<=4 ; hab++){
		 	escreva ("Digite seu salário: ")
		 	leia (salario)
		 	salarioTotal += salario

		 	//maior salário
		 	se (salario > maiorSalario){
		 		maiorSalario = salario
		 	}

			se (salario <= 100){
				salarioAte100 = salarioAte100 + 1
			}
			
		 	//média do número de filhos
		 	escreva ("Digite número de filhos: ")
		 	leia (filhos)
		 	filhosTotal += filhos

		 }
		 limpa()
		 
		 mediaSalario = salarioTotal / 4
		 
		 mediaFilhos = filhosTotal / 4

		 porcentagemSalario = (salarioAte100 / 4) * 100

		 escreva("Salario total: ", salarioTotal)
		 escreva("\nMédia total: ", mediaSalario)

		 escreva("\n1Total de filhos: ", filhosTotal)
		 escreva("\nMédia de filhos: ", mediaFilhos)

		 escreva ("\nMaior salário é: " , maiorSalario)

		 escreva ("\nA porcentagem de habitantes com salário até 100: " ,porcentagemSalario, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
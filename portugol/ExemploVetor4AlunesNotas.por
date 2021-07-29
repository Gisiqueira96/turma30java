programa
{
	
	funcao inicio()
	{
		/*
		 * Pedir o nome do aluno - vetor = alunes 4
		 * nota - vetor = notas 4
		 * digite o nome:_
		 * digite a nota:_
		 * Mostrar o nome e a nota de cada aluno.
		 * de 0 - 5 "estude mais"
		 * acima de 5 "Muito bem continue assim"
		 */

		 cadeia alunes [4]
		 inteiro notas [4]

		para (inteiro i = 0 ; i<4 ; i++){
		escreva ("Digite o nome do aluno: ")
			leia (alunes [i])
		escreva ("Digite o nota do aluno: ")
			leia (notas [i])
		}
		escreva ("Nomes e notas dos alunos: \n" )
		para(inteiro i = 0 ; i<4 ; i++){
			escreva ( "** Nome: " + alunes [i] + " " + "Nota: " + notas [i] + " **\n")
		se (notas [i] <= 5){
			escreva("Não foi dessa vez, estude mais!! =(\n") 
		}senao{
			escreva ("Muito bem continue assim!! =)\n")
		}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
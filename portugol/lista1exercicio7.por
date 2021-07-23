programa
{
	
	funcao inicio()
	{
		/*
		 * Um sistema de equações lineares do tipo: 
		 * ax + ab = c
		 * dx + ey = f, pode ser resolvido segundo mostrado abaixo : 
		 * x = (ce - bf) / (ae - bd) 
		 * y = (af - cd) / (ae - bd)
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
		 * calcula e mostra os valores de x e y. 
		 */
		
		real a, b, c, d, ex, f, x, y

		escreva("Digite o valor a: ")
		leia (a)
		escreva ("Digite o valor b: ")
		leia (b)
		escreva ("Digite o valor c: ")
		leia (c)
		escreva ("Digite o valor d: ")
		leia (d)
		escreva ("Digite o valor e: ")
		leia (ex)
		escreva ("Digite o valor f: ")
		leia (f)

		x = ((c * ex)-(b * f)) / ((a * ex)-(b * d))
		escreva ("Valor de x é: " + x + "\n")

		y = ((a * f)-(c * d)) / ((a * ex)-(b * d))
		escreva ("Valor de y é: " + y)
 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 815; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
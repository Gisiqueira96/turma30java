programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
	/*
	 * 6. Construa um programa em c que, tendo como dados de entrada dois 
	 * pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância 
	 * entre eles. A fórmula que efetua tal cálculo é: d= raiz (X2 - X1)² + (Y2 - Y1)²
	 */


	 real x1, x2, y1, y2, d
	 real p1, p2

	 escreva ("Informe o valor da cordenada x1: ")
	 leia (x1)
	 escreva ("Informe o valor da cordenada x2: ")
	 leia (x2)
	 escreva ("Informe o valor da cordenada y1: ")
	 leia (y1)
	 escreva ("Informe o valor da cordenada y2: ")
	 leia (y2)

	//p1 = (x2 - x1) * (x2 - x1)
	p1= Mat.potencia((x2-x1),2)
	p2= Mat.potencia((y2-y1),2)
	d= Mat.raiz((p1 + p2),2)

	// d= Mat.raiz ((Mat.potencia((x2-x1),2) + Mat.potencia ((y2 - y1),2)),2)

	escreva("A distancia é: " + d)
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 824; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
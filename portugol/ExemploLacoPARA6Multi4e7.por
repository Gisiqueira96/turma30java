programa
{
	
	funcao inicio()
	{
		//1- 1000
		//multiplos de 4 entre 100 e 200
		//somatório dos números impares entre 400 e 1000, multiplos de 7
		inteiro totalMultiplos4 = 0
		inteiro totalMultiplos7Impares = 0

	
		para (inteiro x=1 ; x<=1000 ; x++){
			se ((x%4)==0 e x>= 100 e x<=200){
				totalMultiplos4 += x
			}
		
			se ((x%7)==0 e (x%2)==1 e x>= 400){
				totalMultiplos7Impares += x
			}
	
		}
		escreva ("\nSomatória dos multiplos de 4 é:" , totalMultiplos4)
		escreva ("\nSomatória dos multiplos de 7 é: " , totalMultiplos7Impares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
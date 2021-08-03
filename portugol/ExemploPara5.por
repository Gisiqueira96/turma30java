programa
{
	
	funcao inicio()
	{
		
	//100 - 200
	// multiplos de 4
	//faço isso de 100 até 200
		inteiro total=0
	
		para (inteiro x=1; x<=100; x++){
			/*
			se ((x%3)==0){
				total = total + x	
			}
			*/
			 //totalizador - didatico
			se ((x%3)==0 e (x%2)==1){
				escreva("x ", x, " + o total ",total, " = ")
				total += x //totalizador
				escreva(total,"\n")	
			}
			
			
			
		}
		escreva("o  total dos valores é : ",total)
		
		
	}
 //depois da funcao inicio

	funcao linha(inteiro tamanho){
		para (inteiro x=1; x <= tamanho; x++){
			escreva("-")	
		}
		escreva("\n")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
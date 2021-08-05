programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Calendario --> cal
	inclua biblioteca Texto --> txt
	
	
	
	funcao inicio()
	{
		
			cadeia verificarRepeticao[10] = {"","","","","","","","","",""} //auxilia na verificação quando código é selicionado mais de uma vez em uma compra
			cadeia codProduto[] = { "G3-1", "G3-2","G3-3","G3-4","G3-5","G3-6","G3-7","G3-8","G3-9","G3-10"} 
			cadeia produto[] = { "Glutamina", "Vitamina C", "Regata Cav", "Tenis Sports", "Whey Prot", "Snacks Div", "C. Legging", "Camiseta", "BCAA CAPS", "Corda P."}
			real preco[] = { 30.00, 15.00, 45.00, 100.00, 75.00, 12.00, 80.00, 24.00, 42.00, 20.00 }
			inteiro estoque[10] 
			inteiro carrinhoCompras[10]
			caracter desejaEntraNoSite
			inteiro contador = 0
			cadeia auxCod 
			inteiro auxQuant = 0
			caracter continua = 's'
			real total = 0.0
			inteiro opcao = 0
			logico brasilia = falso
			caracter desejaVoltarParaSite
			cadeia zerarCarrinho

			
			
			para(contador = 0 ; contador < 10 ; contador++){
				estoque[contador] = 10
				
			}
			faca{
				insereBanner() 
				escreva("\nDeseja entrar no site [S/N] ?: ")
				leia(desejaEntraNoSite)
				limpa ()
			se(desejaEntraNoSite == 'S' ou desejaEntraNoSite == 's')
			{
				tituloTabela()
				para(contador = 0 ; contador < 10 ; contador++){
					escreva ("\n\t♥     ",codProduto[contador]," \t♥\t", produto[contador],"\t♥\t", preco[contador],"\t   ♥\t  ",estoque[contador],"\t   ♥")
				}
					linha(verdadeiro)
				faca{
					escreva("\n\nSelecione o código do produto : ")
					leia(auxCod)
					auxCod = txt.caixa_alta(auxCod)
					
					para(contador = 0 ; contador < 10 ; contador++){
						se(verificarRepeticao[contador] == auxCod){
							escreva("\nVocê já selecionou esse produto, deseja escolher outro [S/N] ?  \n")
							leia (continua)
							limpa()
							se (continua == 'S' ou continua == 's'){
								auxQuant = 0
								tituloTabela()
								para(contador = 0 ; contador < 10 ; contador++){
									escreva ("\t♥     ",codProduto[contador]," \t♥\t", produto[contador],"\t♥\t", preco[contador],"\t   ♥\t  ",estoque[contador],"\t   ♥\n")
										
									}
									linha(verdadeiro)
								contador -= 1
								
								faca {
								escreva("\nSelecione o código do produto : ")
									leia(auxCod)
								
								escreva("\n\nDigite a quantidade desejada : ")
								leia(auxQuant)
								}enquanto (auxCod == codProduto[contador])
	
							}senao{
								
							}
						}

						se(auxCod == codProduto[contador]){
							verificarRepeticao[contador] = codProduto[contador]
							escreva("Código : ",codProduto[contador],"\nProduto : ",produto[contador],"\nValor : ",preco[contador],"\nEstoque : ",estoque[contador])
							escreva("\n\nDigite a quantidade desejada : ")
							leia(auxQuant)
							enquanto(auxQuant<=0){
								escreva("Valor inválido, digite novamente: ")
								leia(auxQuant)
							}
							se (auxQuant > estoque[contador]){
								escreva ("Digite a quantidade mediante o estoque !")
								escreva("\n\nDigite a quantidade desejada : ")
								leia(auxQuant)
							}
							pare						
						}							
					}
					para (contador = 0; contador < 10; contador++){
						se (auxCod == codProduto[contador]){
							total += auxQuant * preco[contador]
							carrinhoCompras[contador] = auxQuant
							tituloCarrinho()
							para (contador = 0; contador < 10; contador++){
								se(carrinhoCompras[contador] != 0){
									escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
									
								}
							}
							linha(falso)
						}
					}
					escreva("\nDeseja continuar a compra [S/N] ?: ")
					leia(continua)
					limpa()
					tituloTabela()
					para(contador = 0 ; contador < 10 ; contador++){						
						se (continua == 'S' ou continua == 's'){
							escreva ("\n\t♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",estoque[contador],"\t   ♥")						
						}
					}
					linha(verdadeiro)
				}enquanto(continua == 'S' ou continua == 's')
				
					//compra finalizada, mostrando o carrinho final 
					limpa()
					
					tituloCarrinho()
					para (contador = 0; contador < 10; contador++){
						se(carrinhoCompras[contador] != 0){
							escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")						
						}
					}
					linha(falso)
					escreva("\nVALOR DA COMPRA : ",total)	
					escreva("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ")
					leia(opcao)
					limpa()
					linhaNota(verdadeiro)

					//opções de pagamento e emissão das nostas fiscais
					enquanto(opcao >3 ou opcao <=0){
						escreva("Opção inválida, escolha novamente: ")
						escreva("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ")
						leia(opcao)
					}
					
					se(opcao == 1){
						para (contador = 0; contador < 10; contador++){
							se(carrinhoCompras[contador] != 0){
								
								escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
							}
						}
						escreva("\n\nDinheiro à vista")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n10% de desconto : R$ ",mat.arredondar(((total + (total * 0.09))*0.1),2))
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar(((total * 0.9)*1.09),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)
						
					}
						se(opcao ==2){
							para (contador = 0; contador < 10; contador++){
							se(carrinhoCompras[contador] != 0){
								
								escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
							}

						}
						escreva("\n\nCartão à vista")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n10% de acréscimo : R$ ",mat.arredondar(((total + (total * 0.09))*0.1),2))
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar(((total * 1.1)*1.09),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)
						}
						senao se (opcao ==3){
								para (contador = 0; contador < 10; contador++){
							se(carrinhoCompras[contador] != 0){
								escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
							}
						}
						escreva("\n\n2x no Cartão")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n15% de acréscimo : R$ ",mat.arredondar(((total + (total * 0.09))*0.15),2))
						escreva("\nValor da parcela : R$ ",mat.arredondar(((   (total + (total * 0.09))   +    (((total + (total * 0.09))*0.15))   )/2)  ,2))
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar((total + (total * 0.09))+((total + (total * 0.09))*0.15),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)
							}

					//zerando carrinho										
																
					auxQuant=0					
					contador=0
					para(inteiro x = 0; x < 10; x++){				
					verificarRepeticao[x] = " "					
					}
						
					para(inteiro x = 0; x < 10; x++){				
						estoque[x] -= carrinhoCompras[x]						
					}
					para(inteiro x = 0; x < 10; x++){				
						carrinhoCompras[x] = 0			
						total = 0.0				
					}					
					}
					escreva("Deseja retornar para o site [S] / [N]: ")
					leia(desejaVoltarParaSite)
					limpa()

				}	
				enquanto(desejaVoltarParaSite == 's' ou desejaVoltarParaSite == 'S' )
				limpa()
				escreva("Agradecemos a visita !!!")
		}
		

		funcao insereBanner() {
		escreva("www.devsaudavel.com.br || versão 1.5\n")
		escreva ("\t\t\t\t*****DEV SAUDÁVEL*****\n")
		escreva ("\t\t\t\tProgramando a sua saúde\n")	
		}	
		
		funcao tituloTabela(){
			escreva ("\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥\n")
			escreva ("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥")
			escreva("\n\t════════════════════════════════════════════════════════════════════════════\n ")
			escreva ("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥\n")
			
		}
		
		funcao tituloCarrinho(){
			escreva("\n═════════════════════════════════════════════════════════════════════════════════════════════\n")
			escreva("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥\n")	
			escreva ("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥\n")
		}
		
		funcao linha(logico forte){
			se(forte){
				escreva("\n\t════════════════════════════════════════════════════════════════════════════\n")
				
			}
			senao{
				escreva("═════════════════════════════════════════════════════════════════════════════════════════════\n")
				
		}
		}
		funcao linhaNota(logico forte){
			se(forte){
				escreva("======================================= NOTA FISCAL =========================================\n")
				escreva("\nwww.devsaudavel.com.br || versão 1.5\n")
				escreva ("\t\t\t\t  *****DEV SAUDÁVEL*****\n")
				escreva ("\t\t\t\t  Programando a sua saúde\n")
				escreva ("\n\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥\n")
			}
			senao{
				escreva("\n=============================================================================================\n")
			}
		}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
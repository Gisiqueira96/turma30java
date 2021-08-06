/*
 * Projeto Ecommerce, loja de produtos saudáveis.
 * Programado por:
 * Ana Beatriz Yujra Espejo
 * Giovanna Siqueira Paiva dos Penedos
 * Henrique Uriel Lopes
 * Maicon Gomes Cerqueira
 * Vinicius Cardoso Siqueira Francisco
 */

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
			//Entrada para o site.
			faca{
				insereBanner() 
				escreva("\nDeseja entrar no site [S/N] ?: ")
				leia(desejaEntraNoSite)
				limpa ()
				//Tabela de código de produtos, produtos, preços e estoque.
			se(desejaEntraNoSite == 'S' ou desejaEntraNoSite == 's'){
				tituloTabela()
				para(contador = 0 ; contador < 10 ; contador++){
					escreva ("\n\t♥     ",codProduto[contador]," \t♥\t", produto[contador],"\t♥\t", preco[contador],"\t   ♥\t  ",estoque[contador],"\t   ♥")
				}
					linha(verdadeiro)
				//Seleção do código do produto.
				faca{
					escreva("\n\nSelecione o código do produto : ")
					leia(auxCod)
					auxCod = txt.caixa_alta(auxCod)
					//O produto selecionado ja existe no carrinho, pergunta se deseja modifica-lo.
					para(contador = 0 ; contador < 10 ; contador++){
						se(verificarRepeticao[contador] == auxCod){
							escreva("\nVocê já selecionou esse produto, deseja escolher outro [S/N] ?  \n")
							leia (continua)
							limpa()
							//Caso deseja escolher outro produto que não esteja no carrinho.
							se (continua == 'S' ou continua == 's'){
								auxQuant = 0
								tituloTabela()
								//Tabela de produto para que seja escolhido outro produto.
								para(contador = 0 ; contador < 10 ; contador++){
									escreva ("\t♥     ",codProduto[contador]," \t♥\t", produto[contador],"\t♥\t", preco[contador],"\t   ♥\t  ",estoque[contador],"\t   ♥\n")
								}
									linha(verdadeiro)
									escreva("\nSelecione o código do produto : ")
									leia(auxCod)
									auxCod = txt.caixa_alta(auxCod)
									contador = 0
									enquanto(auxCod !=codProduto[contador]){
										contador++
									}
							//Caso deseja modificar o produto existente no carrinho.
							}senao{
								escreva("Escolha a nova quantidade do produto ",codProduto[contador]," que deseja")
							}
						}
						//Quantidade desejada do produto.
						se(auxCod == codProduto[contador]){
							verificarRepeticao[contador] = codProduto[contador]
							escreva("Código : ",codProduto[contador],"\nProduto : ",produto[contador],"\nValor : ",preco[contador],"\nEstoque : ",estoque[contador])
							escreva("\n\nDigite a quantidade desejada : ")
							leia(auxQuant)
							//Caso a quantidade seja negativa ou 0.
							enquanto(auxQuant<=0){
								escreva("Valor inválido, digite novamente: ")
								leia(auxQuant)
							}
							//Quantidade inexistente no estoque
						se (auxQuant > estoque[contador]){
								escreva ("Digite a quantidade mediante o estoque !")
								escreva("\n\nDigite a quantidade desejada : ")
								leia(auxQuant)
						}
							pare						
						}							
					}
					//Carrinho durante a compra
					para (contador = 0; contador < 10; contador++){
						se (auxCod == codProduto[contador]){
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
					//Após adicionar o produto no carrinho, se deseja continuar comprando.
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
				
					//Compra finalizada, mostrando o carrinho final 
					limpa()
					tituloCarrinho()
					para (contador = 0; contador < 10; contador++){
						se(carrinhoCompras[contador] != 0){
							escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")						
						total += auxQuant * preco[contador]
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
					//Opção de pagamento 1 - a vista.
					se(opcao == 1){
						para (contador = 0; contador < 10; contador++){
							se(carrinhoCompras[contador] != 0){
								escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
							}
						}
						escreva("\n\nDinheiro à vista")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n10% de desconto : R$ ",mat.arredondar((total * 0.1),2))
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar((total * 0.9),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)	
					}
					//Opção de pagamento 2 - a vista no catão.
					se(opcao ==2){
						para (contador = 0; contador < 10; contador++){
						se(carrinhoCompras[contador] != 0){
							escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
						}

					}
						escreva("\n\nCartão à vista")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n10% de acréscimo : R$ ",mat.arredondar((total * 0.1),2))
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar((total * 1.1),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)
						}
					//Opção de pagamento 3 - em 2X no catão.
					senao se (opcao ==3){
							para (contador = 0; contador < 10; contador++){
						se(carrinhoCompras[contador] != 0){
							escreva ("♥     ",codProduto[contador]," \t♥\t",produto[contador],"\t♥\t",preco[contador],"\t   ♥\t  ",carrinhoCompras[contador],"\t♥\t",carrinhoCompras[contador] * preco[contador],"\t    ♥\n")
						}
					}
						escreva("\n\n2x no Cartão")
						escreva("\n9% de ICMS : R$ ",mat.arredondar((total * 0.09),2))
						escreva("\n15% de acréscimo : R$ ",mat.arredondar((total * 0.15),2))
						escreva("\nValor da parcela : R$ ",mat.arredondar((total * 1.15),2)/2,"\n")
						escreva("\n\nTOTAL DA COMPRA R$ ",mat.arredondar((total * 1.15),2),"\n")
						escreva("\n\t\t\t\t\t\tData de emissão : ",cal.dia_mes_atual(),"/",cal.mes_atual(),"/",cal.ano_atual())
						escreva("    Hora : ", cal.hora_atual(brasilia),":",cal.minuto_atual(),":",cal.segundo_atual())
						linhaNota(falso)
					}

					//Zerando carrinho																					
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
					//retorno para o site.
					escreva("Deseja retornar para o site [S] / [N]: ")
					leia(desejaVoltarParaSite)
					limpa()
				}	
				//Mensagem para retorno no site
				enquanto(desejaVoltarParaSite == 's' ou desejaVoltarParaSite == 'S' )
				limpa()
				escreva("Agradecemos a visita !!!")
		}
		
		//Cabeçalho do site
		funcao insereBanner() {
		escreva("www.devsaudavel.com.br || versão 1.7\n")
		escreva ("\t\t\t\t*****DEV SAUDÁVEL*****\n")
		escreva ("\t\t\t\tProgramando a sua saúde\n")	
		}	
		//Cabeçalho da tabela
		funcao tituloTabela(){
			escreva ("\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥\n")
			escreva ("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥")
			escreva("\n\t════════════════════════════════════════════════════════════════════════════\n ")
			escreva ("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥\n")
		}
		//Cabeçalho do carrinho
		funcao tituloCarrinho(){
			escreva("\n═════════════════════════════════════════════════════════════════════════════════════════════\n")
			escreva("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥\n")	
			escreva ("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥\n")
		}
		//Linha divisão 
		funcao linha(logico forte){
			se(forte){
				escreva("\n\t════════════════════════════════════════════════════════════════════════════\n")	
			}
			senao{
				escreva("═════════════════════════════════════════════════════════════════════════════════════════════\n")
			}
		}
		//Cabeçalho nota fiscal
		funcao linhaNota(logico forte){
			se(forte){
				escreva("======================================= NOTA FISCAL =========================================\n")
				escreva("\nwww.devsaudavel.com.br || versão 1.7\n")
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
 * @POSICAO-CURSOR = 5464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
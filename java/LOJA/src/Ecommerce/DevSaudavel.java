package Ecommerce;

	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.text.DecimalFormat;

	public class DevSaudavel {
			/*
			 * Projeto Ecommerce, loja de produtos saudáveis.
			 * Programado por:
			 * Ana Beatriz Yujra Espejo
			 * Giovanna Siqueira Paiva dos Penedos
			 * Henrique Uriel Lopes
			 * Maicon Gomes Cerqueira
			 * Vinicius Cardoso Siqueira Francisco
			 */
		public static void main(String[] args) {
	//Início VINICIUS 			        
			DecimalFormat df = new DecimalFormat("#.00");//arredondamento do valor								
			LocalDateTime agora = LocalDateTime.now();//data/hora atual
			DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// formatar a data
			String dataFormatada = formatterData.format(agora);// formatar a hora
			DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
			String horaFormatada = formatterHora.format(agora);
			Scanner ler = new Scanner(System.in);
	     	String [] verificarRepeticao = {"","","","","","","","","",""}; //Auxilia na verificação de um código, se selicionado mais de uma vez numa compra
			String [] codProduto = { "G3-1", "G3-2","G3-3","G3-4","G3-5","G3-6","G3-7","G3-8","G3-9","G3-10"};
			String [] produto = { "Glutamina", "Vitamina C", "Regata Cav", "Tenis Sports", "Whey Prot", "Snacks Div", "C. Legging", "Camiseta", "BCAA CAPS", "Corda P."};
			String zerarCarrinho = " ";
			String auxCod = " ";
			double [] preco = { 30.00, 15.00, 45.00, 100.00, 75.00, 12.00, 80.00, 24.00, 42.00, 20.00 };
			double total = 0.0;			
			int[] estoque = new int[10];  
			int[] carrinhoCompras = new int[10];
			int contador = 0;
			int opcao = 0;
			int auxQuant = 0;
			char continua = ' ';
			char desejaEntraNoSite = ' ';
			char desejaVoltarParaSite = ' ';
			
			//Limita o estoque do produto até 10
			for(contador = 0 ; contador < 10 ; contador++){
				estoque[contador] = 10;	
			}
			//Entrada para o site
			do{
				insereBanner(); //Maic
				do{
					System.out.print("\nDeseja entrar no site [S/N] ? : ");
					desejaEntraNoSite = ler.next().toUpperCase().charAt(0);
				}while(desejaEntraNoSite != 'S' && desejaEntraNoSite != 'N');
				//Tabela de código, produtos, preços e estoque
				if(desejaEntraNoSite == 'S' || desejaEntraNoSite == 's'){
					tituloTabela(); //Maic
					for(contador = 0 ; contador < 10 ; contador++){
						System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
					}//for
					linha(true); //Maic
	//Fim VINICIUS 
	//Início ANA 
						do {
							System.out.print("\n\nSelecione o código do produto : ");
							auxCod = ler.next().toUpperCase();
							//Se o produto selecionado estiver no carrinho, é perguntado se deseja modificá-lo
							for(contador = 0; contador < 10;contador++) {
								if(auxCod.equals(verificarRepeticao[contador])) {
									System.out.print("\nVocê já selecionou este produto, deseja escolher outro [S/N] ? ");
									continua = ler.next().toUpperCase().charAt(0);
									//Caso cliente deseja escolher outro produto que não esteja no carrinho
									if(continua == 'S') {
										auxQuant = 0;
										tituloTabela(); //Maic									
										for(contador = 0;contador < 10;contador++) {
											System.out.print("\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥\n");
										}
										linha(true); //Maic
										System.out.print("\nSelecione o código do produto : ");
										auxCod = ler.next().toUpperCase();
										contador = 0;
										while(auxCod.equalsIgnoreCase(codProduto[contador])){
											contador++;
										}
									}//Caso deseja modificar o produto existente no carrinho
										
								}
	//Fim ANA 
	//Início HENRIQUE 
								//Quantidade desejada do produto
								if (auxCod.equals(codProduto[contador])) {
							 		verificarRepeticao[contador] = codProduto[contador];
							 		System.out.print("Código : "+codProduto[contador]+"\nProduto : "+produto[contador]+"\nValor : "+preco[contador]+"\nEstoque : "+estoque[contador]);
							 		System.out.print("\n\nDigite a quantidade desejada : ");
							 		auxQuant = ler.nextInt();
							 		//Caso a quantidade seja negativa ou 0.
							 		while (auxQuant<=0) {
							 		System.out.print("Valor inválido, digite novamente: ");
							 		auxQuant = ler.nextInt();
							 		}
							 		//Quantidade inexistente no estoque
							 		if (auxQuant > estoque[contador] && estoque[contador] == 0) {
							 			System.out.print("Produto em falta! Digite ' 0 'para prosseguir ");
							 			while (auxQuant > estoque[contador]) {
							 			auxQuant = ler.nextInt();	
							 			}
							 		}
							 		else if (auxQuant > estoque[contador]) {
							 			while (auxQuant > estoque[contador] && estoque[contador] <= 0) {
							 			System.out.print("\nDigite a quantidade mediante o estoque !");	
							 			System.out.print("\n\nDigite a quantidade desejada : ");
							 			auxQuant = ler.nextInt();
							 			}
							 		}
							 		break;	 				
							 	}
							} 
								//Carrinho durante a compra
					 			for (contador = 0; contador < 10; contador++) {
					 				if (auxCod.equals(codProduto[contador])) {
					 				carrinhoCompras[contador] = auxQuant;
					 				tituloCarrinho(); //Maic
					 					for (contador = 0; contador < 10; contador++) {
					 						if(carrinhoCompras[contador] != 0) {
					 							System.out.print("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ♥\n");			
					 						}
					 					}
					 				linha(false); //Maic
					 				}
					 			}
						 		//Após adicionar o produto no carrinho, é perguntado novamente
						 		do{
						 			System.out.print("\nDeseja continuar a compra [S/N] ?: ");
						 			continua = ler.next().toUpperCase().charAt(0);
						 		}while(continua != 'S' && continua != 'N');
						 		
						 		tituloTabela(); //Maic
						 		for (contador = 0 ; contador < 10 ; contador++) {
						 			if (continua == 'S') {
					 				System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
						 			}
						 		}
					 		linha(true); //Maic	
						}while (continua == 'S');
	//Fim HENRIQUE 
	//Início GIOVANNA 
						//Compra finalizada - Carrinho final 
						tituloCarrinho(); //Maic
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.printf("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador] * preco[contador])+"\t    ♥\n");
								total += carrinhoCompras[contador] * preco[contador];
							}
						}
						linha(false); //Maic
						System.out.printf("\nVALOR DA COMPRA : %.2f",total);
						System.out.println("\n\nFORMAS DE PAGAMENTO : ");
						System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
						System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
						System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
						System.out.print("\nDigite a opção de pagamento : ");
						opcao = ler.nextInt();
						linhaNota(true); //Maic					
						//Opções de Pagamento
						while (opcao >3 || opcao <=0) {
							System.out.println("Opção inválida, escolha novamente: ");
							System.out.println("\n\nFORMAS DE PAGAMENTO : ");
							System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
							System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
							System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
							System.out.print("\nDigite a opção de pagamento : ");
							opcao = ler.nextInt();
						}					
						//Opção 1 - à vista
						if (opcao == 1) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
								}
							}
							System.out.println("\n\nDinheiro à vista");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
							System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9)+"\n");
							System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}
						//Opção 2 - à vista cartão
						if (opcao == 2) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
								}
							}
							System.out.println("\n\nCartão à vista");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("10% de acréscimo : R$ "+df.format(total * 0.1));
							System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1)+"\n");
							System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}	
						//Opção 3 - em 2X no cartão
						else if (opcao == 3) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
								}
							}
							System.out.println("\n\n2X no Cartão");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("15% de acréscimo : R$ "+df.format(total * 0.15));
							System.out.println("Valor da parcela : R$ "+df.format((total * 1.15)/2)+"\n");
							System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.15)+"\n");
							System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}					
						//Zerando carrinho para nova compra
						auxQuant=0;				
						contador=0;
						for (contador = 0; contador < 10; contador++) {
							verificarRepeticao[contador] = " ";
						}
						for (contador = 0; contador < 10; contador++) {
							estoque[contador] -= carrinhoCompras[contador];
						}
						for (contador = 0; contador < 10; contador++) {
							carrinhoCompras[contador] = 0;		
							total = 0.0;
						}
					}
				else {
					break;
				}
				do{
					System.out.print("\nDeseja continuar a compra [S/N] ?: ");
					desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);	
		 		}while(continua != 'S' && continua != 'N');
			}while (desejaVoltarParaSite == 'S');
			System.out.println("Agradecemos a visita ♥\nVolte Sempre !!!\n");
			
		}//void main
	//Fim GIOVANNA
		
	//Início MAICON

		//Cabeçalho do site
		public static void insereBanner() {
			System.out.println("www.devsaudavel.com.br || versão 2.0\n");
			System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****");
			System.out.println("\t\t\t\tProgramando a sua saúde");
		}

		//Cabeçalho da tabela
		public static void tituloTabela() {
			System.out.println("\n\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
			System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
			System.out.println("\t════════════════════════════════════════════════════════════════════════════ ");
			System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥");
		}

		//Cabeçalho do carrinho
		public static void tituloCarrinho() {
			System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥");
			System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
		}
		
		//Linha divisão 
		public static void linha(boolean forte){
			if(forte){
				System.out.println("\n\t════════════════════════════════════════════════════════════════════════════");
			}
			else {
				System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════");
			}
		}
		
		//Cabeçalho nota fiscal
		public static void linhaNota (boolean forte){
			if (forte){
				System.out.println("======================================= NOTA FISCAL =========================================\n");
				System.out.println("\nwww.devsaudavel.com.br || versão 2.0\n");
				System.out.println("\t\t\t\t  *****DEV SAUDÁVEL*****\n");
				System.out.println("\t\t\t\t  Programando a sua saúde\n");
				System.out.println("\n\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥\n");
			}
			else {
				System.out.println("\n=============================================================================================\n");
			}
		}
	//Fim MAICON
	}
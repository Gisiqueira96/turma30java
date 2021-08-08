import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DevSaudavel {

	public static void main(String[] args) {
		/*
		 * Projeto Ecommerce, loja de produtos saudáveis.
		 * Programado por:
		 * Ana Beatriz Yujra Espejo
		 * Giovanna Siqueira Paiva dos Penedos
		 * Henrique Uriel Lopes
		 * Maicon Gomes Cerqueira
		 * Vinicius Cardoso Siqueira Francisco
		 */
		
		
		
		        //arredondamento do valor
		DecimalFormat df = new DecimalFormat("#.00");
				
				//data/hora atual
		LocalDateTime agora = LocalDateTime.now();
				// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dataFormatada = formatterData.format(agora);
				// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		Scanner ler = new Scanner(System.in);
     	String [] verificarRepeticao = {"","","","","","","","","",""}; //auxilia na verificação quando código é selicionado mais de uma vez em uma compra
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
		boolean brasilia = false;
		//depois se vai ser necessário retornar esses valores

		for(contador = 0 ; contador < 10 ; contador++){
			estoque[contador] = 10;	
		}//fim for
					//Entrada para o site.
		do{
			//FUNCAO insereBanner() /Maic
			System.out.print("\nDeseja entrar no site [S/N] ?: ");
			desejaEntraNoSite = ler.next().toUpperCase().charAt(0);
			//pensar em como fazer o limpa ()
			//Tabela de código de produtos, produtos, preços e estoque.
			if(desejaEntraNoSite == 'S' || desejaEntraNoSite == 's'){
				//FUNCAO tituloTabela() /Maic
				for(contador = 0 ; contador < 10 ; contador++){
					System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
				}//for
				//FUNCAO linha(verdadeiro) /Maic
					do {
						System.out.print("\n\nSelecione o código do produto : ");
						auxCod = ler.next().toUpperCase();
						//O produto selecionado ja existe no carrinho,pergunta se deseja modifica-lo
						for(contador = 0; contador < 10;contador++) {
							if(auxCod.equals(verificarRepeticao[contador])) {
								System.out.print("\nVocê já selecionou este produto, deseja escolher outro [S/N] ?");
								continua = ler.next().toUpperCase().charAt(0);
								//pensar em como fazer o limpa ()
								//caso deseja escolher outro produto que não esteja no carrinho.
								if(continua == 'S') {
									auxQuant = 0;
									//FUNCAO tituloTabela() /Maic
									
									for(contador = 0;contador < 10;contador++) {
										System.out.print("\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥\n");
									}//fim for /Ana
									//FUNCAO linha(verdadeiro) /Maic
									System.out.print("\nSelecione o código do produto : ");
									auxCod = ler.next().toUpperCase();
									contador = 0;
									while(auxCod.equalsIgnoreCase(codProduto[contador])){
										contador++;
									}//fim while/= /Ana
								}//Caso deseja modificar o produto existente no carrinho.
								else{
									System.out.printf("Digite a nova quantidade : %s",codProduto[contador]);
								}//fim else /Ana	
							}//fim if /Ana
							
						//Quantidade desejada do produto.
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
						 			System.out.print("Produto em falta no estoque, digite 0 para escolher outro produto! ");
						 			while (auxQuant > estoque[contador]) {
						 			auxQuant = ler.nextInt();	
						 			}
						 		}
						 		else if (auxQuant > estoque[contador]) {
						 			while (auxQuant > estoque[contador]) {
						 			System.out.print("\nDigite a quantidade mediante o estoque !");	
						 			System.out.print("\n\nDigite a quantidade desejada : ");
						 			auxQuant = ler.nextInt();
						 			}
						 		}
						 		break;	 				
						 	}
						}//fim for 
							//Carrinho durante a compra
				 			for (contador = 0; contador < 10; contador++) {
				 				if (auxCod.equals(codProduto[contador])) {
				 				carrinhoCompras[contador] = auxQuant;
				 				//tituloCarrinho()
				 					for (contador = 0; contador < 10; contador++) {
				 						if(carrinhoCompras[contador] != 0) {
				 							System.out.print("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ♥\n");			
				 						}
				 					}
				 				//linha(falso)
				 				}
				 			}
					 		//Após adicionar o produto no carrinho, se deseja continuar comprando.
					 		System.out.print("\nDeseja continuar a compra [S/N] ?: ");
					 		continua = ler.next().toUpperCase().charAt(0);
					 		//tituloTabela()
					 		for (contador = 0 ; contador < 10 ; contador++) {
					 			if (continua == 'S') {
				 				System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
					 			}
					 		}
				 		//linha(verdadeiro)		
					 //fim do -- esperando while -- antes do Compra finalizada, mostrando o carrinho final  / Rick	
					}while (continua == 'S');
					//Compra finalizada, mostrando o carrinho final 
					//FUNCAO tituloCarrinho();
					for (contador = 0; contador < 10; contador++) {
						if (carrinhoCompras[contador] != 0) {
							System.out.printf("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador] * preco[contador])+"\t    ♥\n");
							total += carrinhoCompras[contador] * preco[contador];
						}
					}
					//FUNCAO linha(falso)
					System.out.printf("\nVALOR DA COMPRA : %.2f",total);
					System.out.println("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ");
					opcao = ler.nextInt();
					//FUNCAO linhaNota(verdadeiro);
					
					//opções de pagamento e emissão das nostas fiscais
					while (opcao >3 || opcao <=0) {
						System.out.println("Opção inválida, escolha novamente: ");
						System.out.print("\n\nFormas de Pagamento : \nOpção [1] - Dinheiro á vista c/ 10% de desconto\nOpção [2] - Cartão á vista c/ 10% de acréscimo\nOpção [3] - Cartão em 2x c/ 15% de acréscimo\n\nDigite a opção de pagamento : ");
						opcao = ler.nextInt();
					}
					
					//Opção de pagamento 1 - a vista.
					if (opcao == 1) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥\n");
							}
						}//VER COMO ESSAS FUNCOES VAO SE ENCAIXAR
						System.out.print("\n\nDinheiro à vista\n");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
						System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9)+"\n");
						System.out.print("Data: "+formatterData.format(agora)+"\t");
						System.out.print("Hora: "+formatterHora.format(agora)+"\n");
						//FUNCAO linhaNota(falso);
					}
					
					//Opção de pagamento 2 - a vista no catão.
					
					if (opcao == 2) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥\n");
							}
						}//VER COMO ESSAS FUNCOES VAO SE ENCAIXAR
						System.out.print("\n\nCartão à vista\n");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("10% de acréscimo : R$ "+df.format(total * 0.1));
						System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1)+"\n");
						System.out.print("Data: "+formatterData.format(agora)+"\t");
						System.out.print("Hora: "+formatterHora.format(agora)+"\n");
						//FUNCAO linhaNota(falso);
					}
					
					//Opção de pagamento 3 - em 2X no cartão.
					
					else if (opcao == 3) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥\n");
							}
						}//VER COMO ESSAS FUNCOES VAO SE ENCAIXAR
						System.out.print("\n\n2X no Cartão\n");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("15% de acréscimo : R$ "+df.format(total * 0.1));
						System.out.println("\nValor da parcela : R$ "+df.format((total * 1.15)/2)+"\n");
						System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.1)+"\n");
						System.out.print("Data: "+formatterData.format(agora)+"\t");
						System.out.print("Hora: "+formatterHora.format(agora)+"\n");
						//FUNCAO linhaNota(false);
					}
					
					//Zerando carrinho
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
				}//FIM DO IF LINHA 63 
			System.out.println("Deseja retornar para o site [S] / [N]: ");
			desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);
		//chave do faça p/ entrar no site
			//fim if --  antes do Retorno para o site / Gih
			
			//fim do -- esperando while -- antes da Mensagem para retorno no site /Gih
		}while (desejaVoltarParaSite == 'S');
		System.out.println("Agradecemos a visita !!!");
			
	
	
	}//void main
	//Cabeçalho do site
	public static void insereBanner() {
		System.out.println("www.devsaudavel.com.br || versão 2.0\n");
		System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****\n");
		System.out.println("\t\t\t\tProgramando a sua saúde\n");
	}

	//Cabeçalho da tabela
	public static void tituloTabela() {
		System.out.println("\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥\n");
		System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
		System.out.println("\n\t════════════════════════════════════════════════════════════════════════════\n ");
		System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥\n");
	}

	//Cabeçalho do carrinho
	public static void tituloCarrinho() {
		System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════\n");
		System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥\n");
		System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥\n");
	}
	
	//Linha divisão 
	public static void linha(logico forte){
		if(forte){
			System.out.println("\n\t════════════════════════════════════════════════════════════════════════════\n");
		}
		else {
			System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════\n");
		}
	}
	
	//Cabeçalho nota fiscal
	public static void (logico forte){
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
}
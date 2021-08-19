package application;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.FuncoesExtras;
import entities.Produtos;

public class Projeto extends FuncoesExtras {
	/*
	 * PROJETO E-COMMERCE - LOJA DE PRODUTOS SAUDAVEIS PROGRAMADO POR : ANA BEATRIZ
	 * YUJRA ESPEJO GIOVANNA SIQUEIRA PAIVA DOS PENEDOS HENRIQUE URIEL LOPES MAICON
	 * GOMES CERQUEIRA VINICIUS CARDOSO SIQUEIRA FRANCISCO
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");// ARREDONDA VALOR
		LocalDateTime agora = LocalDateTime.now();// DATA/HORA ATUAL
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// FORMATA DATA
		String dataFormatada = formatterData.format(agora);
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");// FORMATA HORA
		String horaFormatada = formatterHora.format(agora);

		// VARIÁVEIS
		Scanner ler = new Scanner(System.in);
		String auxCod = " ";
		double total = 0.0;
		int opcao = 0;
		int auxQuant = 0;
		char continua = ' ';
		char desejaComprar = ' ';
		char desejaVoltarParaSite = ' ';
		int pos = -1;
		char altera = ' ';
		String produtoIgual = "";
		int posicaoProdutoIgual = 0;

		List<Produtos> lista = new ArrayList<>();
		List<Produtos> carrinho = new ArrayList<>();

		lista.add(new Produtos("G3-1", "Glutamina", 30.00, 10));
		lista.add(new Produtos("G3-2", "Vitamina C", 15.00, 10));
		lista.add(new Produtos("G3-3", "Regata Cav", 45.00, 10));
		lista.add(new Produtos("G3-4", "Tenis Sports", 100.00, 10));
		lista.add(new Produtos("G3-5", "Whey Prot", 75.00, 10));
		lista.add(new Produtos("G3-6", "Snacks Div", 10.00, 10));
		lista.add(new Produtos("G3-7", "C.Legging", 80.00, 10));
		lista.add(new Produtos("G3-8", "Camiseta", 25.00, 10));
		lista.add(new Produtos("G3-9", "BCAA CAPS", 50.00, 10));
		lista.add(new Produtos("G3-10", "Corda P.", 22.00, 10));

		// INÍCIO LOOP PROGRAMA
		do {
			// TELA INICIAL
			insereBanner();
			// VALIDA ENTRADA
			do {
				System.out.print("\nDeseja fazer uma compra [S/N] ? : ");
				desejaComprar = ler.next().toUpperCase().charAt(0);
			} while (desejaComprar != 'S' && desejaComprar != 'N');
			// APRESENTAÇÃO TABELA PRODUTOS
			if (desejaComprar == 'S') {
				tituloTabela();
				for (Produtos item : lista) {
					System.out.print("\n\t♥     " + item.getCodProduto() + " \t♥\t" + item.getProduto() + " \t♥\t"
							+ item.getPreco() + "\t   ♥\t  " + item.getEstoque() + "\t   ♥");
				}
				linhaTabela();
				// ESCOLHE PRODUTO
				do {// INICIO LAÇO COMPRA
					System.out.print("\nSelecione o código do produto : ");
					auxCod = ler.next().toUpperCase();
					for (int contador = 0; contador < lista.size(); contador++) {
						if (lista.get(contador).getCodProduto().equals(auxCod)) {
							pos = contador;
							break;
						}
					}
					// VERIFICA A REPETIÇÃO DE PRODUTO NA MESMA COMPRA
					for (int i = 0; i < carrinho.size(); i++) {
						if (carrinho.get(i).getCodProduto().equals(auxCod)) {
							produtoIgual = carrinho.get(i).getCodProduto();
							posicaoProdutoIgual = carrinho.indexOf(carrinho.get(i));
						}
					}
					// TESTE DO PRODUTO REPETIDO
					if (produtoIgual.equals(auxCod)) {
						System.out.print("Você já selecionou este código, deseja alterá-lo [S/N] ?");
						altera = ler.next().toUpperCase().charAt(0);
						if (altera == 'S') {
							// DADOS DO PRODUTO ESCOLHIDO
							System.out.println("CÓDIGO : " + lista.get(pos).getCodProduto());
							System.out.println("PRODUTO : " + lista.get(pos).getProduto());
							System.out.println("VALOR : " + lista.get(pos).getPreco());
							System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
							System.out.print("\nInforme a nova quantidade : ");
							auxQuant = ler.nextInt();
							// VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
							if (auxQuant < 0) {
								System.out.println("Impossível realizar, valor negativo!!!");
							} else if (auxQuant == 0) {
								System.out.println("Impossível realizar, nenhuma quantidade foi escolhida.");
							} else if (lista.get(pos).getEstoque() == 0) {
								System.out.println("Impossível realizar, produto sem estoque!!!");
							} else if (lista.get(pos).getEstoque() < auxQuant) {
								System.out.print("Impossível realizar, quantidade maior que estoque!!");
							} else {
								// ATUALIZA e EXIBE CARRINHO
								carrinho.get(posicaoProdutoIgual).setEstoque(auxQuant);
								tituloCarrinho();
								for (Produtos escolhido : carrinho) {
									System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t"
											+ escolhido.getProduto() + "\t♥\t" + escolhido.getPreco() + "\t   ♥\t  "
											+ escolhido.getEstoque() + "\t♥\t"
											+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
								}
								linhaCarrinho();
							}
						}
						// CASO O PRODUTO NÃO TENHA SIDO SELECIONADO MAIS DE UMA VEZ, ELE VEM DIRETO
						// PARA CÁ
					} else if (pos >= 0) {
						// DADOS DO PRODUTO ESCOLHIDO
						System.out.println("CÓDIGO : " + lista.get(pos).getCodProduto());
						System.out.println("PRODUTO : " + lista.get(pos).getProduto());
						System.out.println("VALOR : " + lista.get(pos).getPreco());
						System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
						System.out.print("\nDigite a quantidade desejada : ");
						auxQuant = ler.nextInt();
						// VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
						if (auxQuant < 0) {
							System.out.println("Impossível realizar, valor negativo!!!");
						} else if (auxQuant == 0) {
							System.out.println("Impossível realizar, nenhuma quantidade foi escolhida.");
						} else if (lista.get(pos).getEstoque() == 0) {
							System.out.println("Impossível realizar, produto sem estoque!!!");
						} else if (lista.get(pos).getEstoque() < auxQuant) {
							System.out.print("Impossível realizar, quantidade maior que estoque!!");
						} else {
							// ATUALIZA e EXIBE CARRINHO
							carrinho.add(new Produtos(lista.get(pos).getCodProduto(), lista.get(pos).getProduto(),
									lista.get(pos).getPreco(), auxQuant));
							tituloCarrinho();
							for (Produtos escolhido : carrinho) {
								System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t"
										+ escolhido.getProduto() + "\t♥\t" + escolhido.getPreco() + "\t   ♥\t  "
										+ escolhido.getEstoque() + "\t♥\t"
										+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
							}
							linhaCarrinho();
						}
					} else {
						System.out.println("Codigo informado não existe!!!");
					}
					// PERGUNTA PARA PROSSEGUIR COM A COMPRA
					System.out.print("\nDeseja continuar a compra [S/N] ?: ");
					continua = ler.next().toUpperCase().charAt(0);
				} while (continua == 'S');// FIM DO LAÇO COMPRA
				// EXIBIÇÃO DO CARRINHO FINAL e ATUALIZA ESTOQUE
				tituloCarrinhoFinal();
				for (Produtos escolhido : carrinho) {
					System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t" + escolhido.getProduto() + "\t♥\t"
							+ escolhido.getPreco() + "\t   ♥\t  " + escolhido.getEstoque() + "\t♥\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
				}
				linhaCarrinhoFinal();
				// CÁLCULO DO CARRINHO FINAL
				for (int i = 0; i < carrinho.size(); i++) {
					pos = i;
					total += (carrinho.get(pos).getPreco() * carrinho.get(pos).getEstoque());
				}
				// OPÇÕES DE PAGAMENTO
				opcoesPagamento();
				System.out.print("\nDigite a opção de pagamento : ");
				opcao = ler.nextInt();
				System.out.print("\n");
				tituloNota();
				while (opcao > 3 || opcao <= 0) {
					System.out.println("Opção inválida, escolha novamente ...");
					opcoesPagamento();
					System.out.print("\nDigite a opção de pagamento : ");
					opcao = ler.nextInt();
				}
				// OPÇÃO 1 - À VISTA
				if (opcao == 1) {
					for (Produtos escolhido : carrinho) {
						System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t" + escolhido.getProduto()
								+ "\t♥\t" + escolhido.getPreco() + "\t   ♥\t  " + escolhido.getEstoque() + "\t♥\t"
								+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
					}
					System.out.println("\nDinheiro à vista");
					System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
					System.out.println("10% de desconto : R$ " + df.format(total * 0.1));
					System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 0.9));
					System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
							+ formatterHora.format(agora));
					linhaNota();
				}
				// OPÇÃO 2 - À VISTA CARTÃO
				if (opcao == 2) {
					for (Produtos escolhido : carrinho) {
						System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t" + escolhido.getProduto()
								+ "\t♥\t" + escolhido.getPreco() + "\t   ♥\t  " + escolhido.getEstoque() + "\t♥\t"
								+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
					}
					System.out.println("\nCartão à vista");
					System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
					System.out.println("10% de acréscimo : R$ " + df.format(total * 0.1));
					System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.1));
					System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
							+ formatterHora.format(agora));
					linhaNota();
				}
				// OPÇÃO 3 - 2X NO CARTÃO
				else if (opcao == 3) {
					for (Produtos escolhido : carrinho) {
						System.out.print("♥     " + escolhido.getCodProduto() + " \t♥\t" + escolhido.getProduto()
								+ "\t♥\t" + escolhido.getPreco() + "\t   ♥\t  " + escolhido.getEstoque() + "\t♥\t"
								+ escolhido.getEstoque() * escolhido.getPreco() + "\t    ♥\n");
					}
					System.out.println("\n2X no Cartão");
					System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
					System.out.println("15% de acréscimo : R$ " + df.format(total * 0.15));
					System.out.println("Valor da parcela : R$ " + df.format((total * 1.15) / 2));
					System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.15));
					System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
							+ formatterHora.format(agora));
					linhaNota();
				}
				// ATUALIZA A LISTA DE PRODUTOS APÓS A COMPRA
				for (int i = 0; i < carrinho.size(); i++) {
					for (int j = 0; j < lista.size(); j++) {
						if (lista.get(j).getCodProduto().equals(carrinho.get(i).getCodProduto())) {
							lista.get(j).setEstoque(lista.get(j).getEstoque() - carrinho.get(i).getEstoque());
						}
					}
				}
				// ZERA CARRINHO
				carrinho.clear();
			} else {
				break;
			}
			do {
				System.out.print("Deseja voltar ao site [S/N] ?: ");
				desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);
				System.out.println();
			} while (continua != 'S' && continua != 'N');
		} while (desejaVoltarParaSite == 'S');
		System.out.println("Agradecemos a visita ♥\nVolte Sempre !!!\n");
	}
}

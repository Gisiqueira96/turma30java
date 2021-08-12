package entities;

import java.util.List;
import java.util.Scanner;

public class Funcoes {
//entra Site
	public static boolean entraNosite() {
		Scanner ler = new Scanner(System.in);
		char entraSite;
		
		
		System.out.print("www.devsaudavel.com.br\n");
		System.out.print("***** DEV SAUDÁVEL: PROGRAMANDO SUA SAÚDE *****\n");
		System.out.print("Deseja entrar no site [S] / [N]: ");
		entraSite = ler.next().toUpperCase().charAt(0);
		
		if (entraSite == 'S') {
			insereBanner ();
			return true;
		} else {
			System.out.print("Obrigado pela visita!!\n");
			return false;
		}	
		
	}
	// banner
	public static void insereBanner () {
		System.out.print("***** DEV SAUDÁVEL: PROGRAMANDO SUA SAÚDE *****\n\r");
		System.out.print("---------------------------------------------------------\n");
		System.out.print("                  RELAÇÕES DE PRODUTOS                  \n");
		System.out.print("---------------------------------------------------------\n");
		System.out.print("COD     VALOR R$      ESTOQUE            PRODUTO\n");
		System.out.print("---------------------------------------------------------\n");
	}

	public static void apresentaTabela(List<Produto> lista, List<Produto> carrinho) {
		String auxCod;
		int auxQuant = 0;
		int pos=-1;
		char op;
		Scanner ler = new Scanner(System.in);
		if(entraNosite()) {
			do {
				pos = -1;
				for (Produto item : lista) {
					System.out.println(item.getCodProduto()+"\t"+item.getPreco()+"\t\t"+item.getEstoque()+"\t\t"+item.getProduto()+((item.getEstoque()>0)?" ":"\tPRODUTO INDISPONIVEL"));
				}
				System.out.println("\nCarrinho de compras");
				System.out.println("COD\tVALOR\tESTOQUE\tPRODUTO\n");
				for (Produto escolhido : carrinho) {
					System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getPreco()+"\t"+escolhido.getEstoque()+"\t"+escolhido.getProduto());
				}
					System.out.print("Digite o codigo do produto: ");
				auxCod = ler.next().toUpperCase();
				//pos = lista.indexOf(auxCod);
				
				for (int x=0; x<lista.size(); x++ ) {
					
					if (lista.get(x).getCodProduto().equals(auxCod)) {
						pos = x;
						break;
					}
					
				}
			
				if (pos>=0) {
					System.out.println("Produto escolhido: \n");
					System.out.println("\nCOD\tVALOR\tESTOQUE\tPRODUTO");
					System.out.printf("%s\t%.2f\t%d\t%s\n",lista.get(pos).getCodProduto(),lista.get(pos).getPreco(),lista.get(pos).getEstoque(),lista.get(pos).getProduto());
					System.out.print("\nQuantidade do Produto: ");
					int auxQtde = ler.nextInt();
					if (auxQtde< 0) {
						System.out.println("Impossivel realizar, valor negativo!!!");
					}
					else if (auxQtde==0) {
						System.out.println("Impossivel realizar, quantidade zero.");
					}
					else if (lista.get(pos).getEstoque()==0){
						System.out.println("Impossivel realizar, produto sem estoque!!!");
					}
					else if (lista.get(pos).getEstoque()< auxQtde) {
						System.out.print("Impossivel realizar, quantidade maior que estoque!!");
					} else {
						carrinho.add(new Produto(lista.get(pos).getCodProduto(),lista.get(pos).getProduto(),lista.get(pos).getPreco(),auxQtde));
					}
				}
				else {
					System.out.println("Codigo informado não existe!!!");
				}
				System.out.print("Continua SIM/NAO [S/N] :");
				op = ler.next().toUpperCase().charAt(0);

			} while (op=='S');
			System.out.println("Fechamento da Compra");
			System.out.println("COD\tVALOR\tESTOQUE\tPRODUTO");
			double auxTotal=0;
			for (Produto escolhido : carrinho) {
					for (int x=0; x<lista.size(); x++ ) {
						
						if (lista.get(x).getCodProduto().equals(escolhido.getCodProduto())) {
							pos = x;
							break;
						}
						
					}
				System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getPreco()+"\t"+escolhido.getEstoque()+"\t"+escolhido.getProduto());
				auxTotal = auxTotal + (escolhido.getPreco()*escolhido.getEstoque());
				lista.get(pos).retiraEstoque(escolhido.getEstoque());				
			}
			System.out.println("TOTAL R$: "+auxTotal+"\n\r");	
			carrinho.clear();
			
			
			System.out.print("Tabela Atualizada:\n\r");
			insereBanner();
			for (Produto item : lista) {		
				System.out.println(item.getCodProduto()+"\t"+item.getPreco()+"\t\t"+item.getEstoque()+"\t\t"+item.getProduto());
			}
			System.out.println("Obrigado pela visita!!\n");
		}
	}


}

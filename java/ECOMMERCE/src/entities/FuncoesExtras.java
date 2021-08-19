package entities;

import java.util.List;
import java.util.Scanner;

public class FuncoesExtras {
	// CABEÇALHO SITE
	public static void insereBanner() {
		System.out.println("www.devsaudavel.com.br\n");
		System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****");
		System.out.println("\t\t\t\tProgramando a sua saúde");
	}

	// CABEÇALHO TABELA
	public static void tituloTabela() {
		System.out.println("\n\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
		System.out.println("\t════════════════════════════════════════════════════════════════════════════ ");
		System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥");
	}

	// LINHA INFERIOR TABELA
	public static void linhaTabela() {
		System.out.println("\n\t════════════════════════════════════════════════════════════════════════════");
	}

	// CABEÇALHO CARRINHO
	public static void tituloCarrinho() {
		System.out.println(
				"\n═════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥");
		System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
	}

	// LINHA INFERIOR CARRINHO
	public static void linhaCarrinho() {
		System.out.println(
				"═════════════════════════════════════════════════════════════════════════════════════════════");
	}

	// CABEÇALHO CARRINHO
	public static void tituloCarrinhoFinal() {
		System.out.println(
				"\n═════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("♥\t\t\t\t  CARRINHO FINAL\t\t\t\t\t    ♥");
		System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
	}

	// LINHA INFERIOR CARRINHO
	public static void linhaCarrinhoFinal() {
		System.out.println(
				"═════════════════════════════════════════════════════════════════════════════════════════════");
	}

	// CABEÇALHO NOTA FISCAL
	public static void tituloNota() {
		System.out.println(
				"======================================= NOTA FISCAL =========================================");
		System.out.println("www.devsaudavel.com.br\n");
		System.out.println("\t\t\t\t  *****DEV SAUDÁVEL*****");
		System.out.println("\t\t\t\t  Programando a sua saúde\n");
		System.out.println("♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
	}

	// LINHA INFERIOR NOTA
	public static void linhaNota() {
		System.out.println(
				"\n=============================================================================================\n");
	}

	// DADOS DO PRODUTO ESCOLHIDO
	public static void dadosProduto(List<Produtos> lista, int auxQuant, int pos) {
		Scanner ler = new Scanner(System.in);
		System.out.println("CÓDIGO : " + lista.get(pos).getCodProduto());
		System.out.println("PRODUTO : " + lista.get(pos).getProduto());
		System.out.println("VALOR : " + lista.get(pos).getPreco());
		System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
		System.out.print("\nInforme a nova quantidade : ");
		auxQuant = ler.nextInt();

	}

	// OPÇÕES DE PAGAMENTO
	public static void opcoesPagamento() {
		System.out.println("\nFORMAS DE PAGAMENTO : ");
		System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
		System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
		System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
	}

}

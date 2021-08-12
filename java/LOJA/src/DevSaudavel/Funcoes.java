package DevSaudavel;

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
			System.out.print("\"Obrigado pela visita!!\n");
			System.exit(0);
			return false;
		}	
		
	}
	// banner
	public static void insereBanner () {
		System.out.print("***** DEV SAUDÁVEL: PROGRAMANDO SUA SAÚDE *****\n\r");
		System.out.print("---------------------------------------------------------\n");
		System.out.print("                  RELAÇÕES DE PRODUTOS                  \n");
		System.out.print("---------------------------------------------------------\n");
		System.out.print("COD      PRODUTO               VALOR R$       ESTOQUE\n");
		System.out.print("---------------------------------------------------------\n");
	}

	public static void apresentaTabela(List<Produto> lista) {
		if(entraNosite()) {
			for (Produto item : lista) {
				System.out.print(item.getCodProduto()+"\t"+item.getProduto()+"\t\t"+item.getPreco()+"\t\t"+item.getEstoque()+"\n");
			}
		}
	}


}

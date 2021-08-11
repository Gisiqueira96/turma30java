	package classeEcommerce;

	import java.util.Scanner;

	public class Funcao {

		//entra Site
			public static void entraNosite() {
				
				Scanner ler = new Scanner(System.in);
				char entraSite;
				
				System.out.print("www.devsaudavel.com.br\n");
				System.out.print("***** DEV SAUDÁVEL: PROGRAMANDO SUA SAÚDE *****\n");
				System.out.print("Deseja entrar no site [S] / [N]: ");
				entraSite = ler.next().toUpperCase().charAt(0);
				do {
				if (entraSite == 'S') {
					insereBanner ();
				} else {
					System.out.print("\"Obrigado pela visita!!\n");
					break;
					}	
				} while (entraSite != 'S');
				
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
		}


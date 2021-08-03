package introducao;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		char genero; //m, f, e
		
		System.out.print("Digite o nome: ");
		nome = ler.nextLine().toUpperCase();
		System.out.print("Selecione M-masculino, F-femenido ou E-neutro: ");
		genero = ler.next().toUpperCase().charAt(0);
		
		if(genero == 'M') {
			System.out.println("Selecionado Masculino.");
		}
		else if (genero == 'F') {
			System.out.println("Selecionado Femenino.");
		}
		else if (genero == 'E') {
			System.out.println("Selecionado Neutro.");
		}
		
		System.out.println();
		System.out.println("[versão println] O nome digitado foi " + nome.toUpperCase());
		System.out.printf("[versão printf] O nome digitado foi %s" , nome);
		
		System.out.println("\nA quantidade de caracteres do nome digitado é: " + nome.length());
			ler.close();
			
	}

}

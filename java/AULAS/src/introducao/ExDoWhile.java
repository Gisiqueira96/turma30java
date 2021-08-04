package introducao;

import java.util.Scanner;


public class ExDoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome = "";
		double salario = 0;
		double maiorSalario = 0;
		String nomeMaiorSalario = "";
		int contador = 1;
		char op;
		
		
		do {
			if (contador > 1) {
				System.out.print("Continua S/N: ");
				op = ler.next().toUpperCase().charAt(0);
				if (op == 'N') {
					break;
				}
			}
			System.out.print("Digite o nome: ");
			nome = ler.next();
			System.out.print("Digite o salário: ");
			salario = ler.nextDouble();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			contador ++;
			
		} while (salario > 0);
		
		System.out.println();
		if (maiorSalario>0) {
			System.out.printf("O maior salario é " + maiorSalario + " da pessoa " + nomeMaiorSalario + "\n");
		}
			System.out.println("Até breve!!");
		ler.close();
	}

}

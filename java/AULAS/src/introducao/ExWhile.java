/*
 * Nome e salario
 * informar nome e o salario da pessoa com o maior salário
 * o programa termina quando for digitado um valor negativo ou zero
 */

package introducao;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome = "";
		double salario = 0;
		double maiorSalario = 0;
		String nomeMaiorSalario = "";
		
		System.out.print("Digite o nome: ");
		nome = ler.next();
		System.out.print("Digite o salário: ");
		salario = ler.nextDouble();
		
		while (salario > 0) {
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			System.out.print("Digite o nome: ");
			nome = ler.next();
			System.out.print("Digite o salário: ");
			salario = ler.nextDouble();
		}
			System.out.printf("O maior salario é " + maiorSalario + " da pessoa " + nomeMaiorSalario);
		ler.close();
	}

}



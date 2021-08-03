/*
 * 3-Faça um programa que receba a idade de uma pessoa e 
 * mostre na saída em qual categoria ela se encontra:
 * 
 * 	•10-14 infantil
 *  •15-17 juvenil
 *  •18-25 adulto
 */

package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Escreva sua idade: ");
		idade = ler.nextInt();
		
		if (idade<10) {
			System.out.print("Você não pertence a nenhuma categoria!!");
		}
		else if (idade>=10 && idade<=14) {
		System.out.print("Voce esta na categoria Infantil!! ");
		}
		else if (idade>=15 && idade<=17) {
		System.out.print("Voce esta na categoria Juvenil!! ");
		}
		else if (idade>=18 && idade<=25) {
		System.out.print("Voce esta na categoria Adulto!! ");
		}
		else if (idade>25) {
			System.out.print("Não possui nenhuma categoria com a sua idade!!");
		}
		
		ler.close();
		

	}

}

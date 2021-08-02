/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa
 *  em anos, meses e dias e mostre-a expressa apenas em dias. 
 */

package lista1;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		System.out.print("Digite os anos: ");
		anos = ler.nextInt();
		System.out.print("Digite os meses: ");
		meses = ler.nextInt();
		System.out.print("Digite os dias: ");
		dias = ler.nextInt();
		
		totalDias = (dias + (anos*365) + (meses *30));
				
				System.out.println("Sua idade em dias é: " + totalDias);
		ler.close();
		
	}
}

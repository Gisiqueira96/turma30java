/*
 *1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. 
 */

package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x1, x2, x3;
		int maior=0;
		
		System.out.println("Escreva o n�mero 1: ");
		x1 =  ler.nextInt();
		System.out.println("Escreva o n�mero 2: ");
		x2 =  ler.nextInt();
		System.out.println("Escreva o n�mero 3: ");
		x3 =  ler.nextInt();
		
		if (x1 > maior) {
			maior = x1;
		}
		if (x2 > maior) {
			maior = x2;
		}
		if (x3 > maior) {
			maior = x3;
		}
		
		System.out.println("O maior n�mero �: " + maior);	
		ler.close();
	}

}

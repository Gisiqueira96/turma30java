/*
 *1-Faça um programa que receba três inteiros e diga qual deles é o maior. 
 */

package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x1, x2, x3;
		int maior=0;
		
		System.out.println("Escreva o número 1: ");
		x1 =  ler.nextInt();
		System.out.println("Escreva o número 2: ");
		x2 =  ler.nextInt();
		System.out.println("Escreva o número 3: ");
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
		
		System.out.println("O maior número é: " + maior);	
		ler.close();
	}

}

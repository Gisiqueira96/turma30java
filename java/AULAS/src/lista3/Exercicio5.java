/*
 * DO...WHILE
 * 5-Crie um programa que leia um n�mero do teclado at� que
 *  encontre um n�mero igual a zero. No final, mostre a soma 
 *  dos n�meros digitados.
 */

package lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		int soma=0;
		
		
		do {
			System.out.print("Digite um numero: ");
			num = ler.nextInt();
			if(num>0) {
				soma += num;
			}
		} while (num != 0);
		System.out.printf("A soma dos n�meros �: %d", soma);
	ler.close();
	}
}

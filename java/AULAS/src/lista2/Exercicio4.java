/*
 * 4-Faça um programa em que permita a entrada de um número qualquer
 * e exiba se este número é par ou ímpar. Se for par exiba também a raiz
 * quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double num; 
		
		System.out.print("Escreva um número: ");
		num = ler.nextDouble();
		
		if (num<0) {
			System.out.print("Esse número é negativo, não é válido!!");
		}
		else if (num == 0) {
			System.out.print("Esse número é neutro, não é válido!!");
		}
		else if ((num%2) == 0) {
			System.out.print("O número é par!!\n");
			System.out.printf("A raiz quadrada de %.2f é %.2f !!" , num , (Math.sqrt(num)));
		}
		else if ((num%2) == 1) {
			System.out.print("O número é ímpar!!\n");
			System.out.printf("O quadrado de %.2f é %.2f !!" , num , (Math.pow(num, 2)));
		}
		ler.close();
	}

}

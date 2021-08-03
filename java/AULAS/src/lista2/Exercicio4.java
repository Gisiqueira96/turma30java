/*
 * 4-Fa�a um programa em que permita a entrada de um n�mero qualquer
 * e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz
 * quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double num; 
		
		System.out.print("Escreva um n�mero: ");
		num = ler.nextDouble();
		
		if (num<0) {
			System.out.print("Esse n�mero � negativo, n�o � v�lido!!");
		}
		else if (num == 0) {
			System.out.print("Esse n�mero � neutro, n�o � v�lido!!");
		}
		else if ((num%2) == 0) {
			System.out.print("O n�mero � par!!\n");
			System.out.printf("A raiz quadrada de %.2f � %.2f !!" , num , (Math.sqrt(num)));
		}
		else if ((num%2) == 1) {
			System.out.print("O n�mero � �mpar!!\n");
			System.out.printf("O quadrado de %.2f � %.2f !!" , num , (Math.pow(num, 2)));
		}
		ler.close();
	}

}

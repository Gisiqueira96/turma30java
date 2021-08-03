/*
 * 2-Faça um programa que entre com três números e coloque em ordem crescente.
 */

package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x1, x2, x3;
		
		System.out.print("Escreva o número 1: ");
		x1 =  ler.nextInt();
		System.out.print("Escreva o número 2: ");
		x2 =  ler.nextInt();
		System.out.print("Escreva o número 3: ");
		x3 =  ler.nextInt();

		if (x1 > x2 && x1 > x3)
		{	
			if (x2 > 3)
			{
				System.out.println(x3 + " " + x2 + " " + x1);
			}
			else
			{
				System.out.println(x2 + " " + x3 + " " + x1);
			}		
		}
		
		else if (x2 > x1 && x2 > x3)
		{	
			if (x1 > 3)
			{
				System.out.println(x3 + " " + x1 + " " + x2);
			}
			else
			{
				System.out.println(x1 + " " + x3 + " " + x2);
			}		
		}
		else
		{
			if (x2 > x1)
			{
				System.out.println(x1 + " " + x2 + " " + x3);
			}
			else
			{
				System.out.println(x2 + " " + x1 + " " + x3);
			}
		}
		ler.close();
		
	}

}

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa
 *  em dias e mostre-a expressa em anos, meses e dias. 
 */

package lista1;

import java.util.Scanner;

public class Exercicio2 {
	
public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		System.out.print("Digite idade em dias: ");
		totalDias = ler.nextInt();
			anos = (totalDias / 365);
			meses = ((totalDias % 365) / 30);
			dias = ((totalDias % 365) % 30);
		System.out.println("\nVocê possuí " + anos +" anos, " + " meses e " + dias + " dias.");
		ler.close();
		
		
	}
}

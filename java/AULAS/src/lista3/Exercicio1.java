/*
 * FOR
 * 1-Informar todos os n�meros de 1000 a 1999 que 
 * quando divididos por 11 obtemos resto = 5.
 */

package lista3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int num, resto=0;
		
		for(num=1000 ; num<=1999 ; num++) {
			resto = (num%11);
			if (resto == 5) {
			System.out.printf("\nN�mero: %d\tResto: %d" , num ,resto);
			}
		}

	}

}

/*
 * FOR
 * 2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */


package lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		int contadorImpar=0;
		int contadorPar=0;

		
		for(num=0 ; num<=10 ; num++) {
			
			System.out.print("Digite um n�mero: ");
			num = ler.nextInt();
			
			if ((num%2) == 0) {
				contadorPar++;
			}
			if ((num%2 == 1)) {
				contadorImpar++;
			}
		}
		System.out.printf("A quantidade de numeros pares �: %d \nA quantidade de numeros impares �: %d",contadorPar,contadorImpar);
		ler.close();
	}
}

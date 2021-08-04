/*
 * FOR
 * 2-Ler 10 números e imprimir quantos são pares e quantos são ímpares.
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
			
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			
			if ((num%2) == 0) {
				contadorPar++;
			}
			if ((num%2 == 1)) {
				contadorImpar++;
			}
		}
		System.out.printf("A quantidade de numeros pares é: %d \nA quantidade de numeros impares é: %d",contadorPar,contadorImpar);
		ler.close();
	}
}

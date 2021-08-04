/*
 * DO...WHILE
 * 6-Escrever um programa que receba vários números inteiros no teclado. E no final
 *  imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 */

package lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
		double media = 0.00;
		int contadorNum=0;
		
		do {
			
			System.out.print("Digite um número inteiro: ");
			num = ler.nextInt();
			
			if((num%3)==0 && num!=0) {
				contadorNum++;
				soma += num;
				media = soma / contadorNum;
			}
			
		}while (num != 0);
		
		
		System.out.print("Soma " + soma);
		System.out.print("\nA média dos números múltiplos de 3 é: " + media);
	ler.close();
	}

}

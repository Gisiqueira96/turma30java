/*
 * WHILE
 * 3-Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99.
 */

package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		int contadorJovem =0;  //Menor de 21
		int contadorAdulto =0; //Entre 21 e 50
		int contadorIdoso =0;  //Maior de 50
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99){
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
			if (idade<=21) {
				contadorJovem++;
			}
			else if (idade>=50) {
				contadorIdoso++;
			}
			else if(idade>21 && idade<50) {
				contadorAdulto++;
			}
		}
		System.out.printf("A quantidade de pessoas com menos de 21 é: %d\nA quantidade de pessoas entre 21 e 50 anos é: %d\nA quantidade de pessoas com mais de 50 anos é: %d", contadorJovem, contadorAdulto, contadorIdoso);
	ler.close();
	}

}

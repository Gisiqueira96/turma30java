/*
 * 3.Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */

package lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		int hora;
		int min;
		int seg;
		int totalSeg;
		
		System.out.print("Digite o tempo em segundos: ");
		totalSeg = ler.nextInt();
		
		hora = totalSeg / 3600;
		min = (totalSeg % 3600) / 60;
		seg = (totalSeg % 3600) % 60;
		
		System.out.println("O total de " + hora + " horas " + min + " minutos " + seg + " segundos.");
		ler.close();
	}

}

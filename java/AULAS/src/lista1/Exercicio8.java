/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo
 *  de fábrica com a percentagem do distribuidor e dos impostos 
 *  (aplicados ao custo de fábrica). Supondo que a percentagem 
 *  do distribuidor seja de 28% e os impostos de 45%, escrever 
 *  um sistema que leia o custo de fábrica de um carro e escreva
 *   o custo ao consumidor.
 */

package lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String[]arg) {
		
		Scanner ler = new Scanner(System.in);
		double custoFab, custoDist, imposto, custoCons;
		
		System.out.print("Digite o custo de fábrica do automóvel: ");
		custoFab = ler.nextDouble();
		
		custoDist = custoFab * 0.28;
		System.out.print("A percentagem do distribuidor é: " + custoDist);
		
		imposto = custoFab * 0.45;
		System.out.print("A percentagem de impostos é: " + imposto);
		
		custoCons = custoFab + custoDist + imposto;
		System.out.print("Custo total ao consumidor é: " + custoCons);
	
		ler.close();
	}

}

/*
 * 6.Construa um programa em c que, tendo como dados de entrada
 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva
 * a distância entre eles. A fórmula que efetua tal cálculo é: 
 * d= raiz (X2 - X1)² + (Y2 - Y1)²
 */

package lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String[]arg) {
		
	Scanner ler = new Scanner(System.in);
	double x1, x2, y1, y2, d;
	double p1, p2;
	
	System.out.print("Informe o valor da coordenada x1: ");
	x1 = ler.nextDouble();
	System.out.print("Informe o valor da coordenada x2: ");
	x2 = ler.nextDouble();
	System.out.print("Informe o valor da coordenada y1: ");
	y1 = ler.nextDouble();
	System.out.print("Informe o valor da coordenada y2: ");
	y2 = ler.nextDouble();
	
	
	p1 = Math.pow((x2 - x1),2);
	p2 = Math.pow((y2 - y1),2);
	d = Math.sqrt(p1 + p2);
	
	//%f - double
	//%d - inteiro
	//%s - String
	//%b - booleando
	System.out.printf("\nA distancia é: %.2f" , d);
	ler.close();
	}

}

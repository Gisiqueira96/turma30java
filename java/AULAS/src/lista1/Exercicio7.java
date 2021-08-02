/*
 * 7. Um sistema de equações lineares do tipo: 
 * ax + by = c
 * dx + ey = f
 * pode ser resolvido segundo mostrado abaixo : 
 * x = (ce - bf)/(ae - bd)
 * y = (af - cd)/(ae - bd)
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f
 * e calcula e mostra os valores de x e y. 
 */

package lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String []arg) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o valor a: ");
		a = ler.nextDouble();
		System.out.print("Digite o valor b: ");
		b = ler.nextDouble();
		System.out.print("Digite o valor c: ");
		c = ler.nextDouble();
		System.out.print("Digite o valor d: ");
		d = ler.nextDouble();
		System.out.print("Digite o valor e: ");
		e = ler.nextDouble();
		System.out.print("Digite o valor f: ");
		f = ler.nextDouble();
		
		x = ((c * e)-(b * f)) / ((a * e)-(b * d));
		System.out.print("Valor de x é: " + x + "\n");
				
		y = ((a * f)-(c * d)) / ((a * e)-(b * d));
		System.out.print("Valor de y é: " + y);
		ler.close();
	}

}

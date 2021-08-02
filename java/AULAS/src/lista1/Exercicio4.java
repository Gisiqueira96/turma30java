/*
 * 4. Escreva  um sistema que leia três números inteiros e positivos
 * (A, B, C) e calcule a seguinte expressão:
 * D = (R + S) /2
 * R = (A + B)^2
 * S = (B + C)^2
 */

package lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String []arg){;
	
	Scanner ler = new Scanner(System.in);
	double a, b, c, d, r, s;
	
	System.out.print("Digite o valor de a: ");
	a = ler.nextDouble();
	System.out.print("Digite o valor de b: ");
	b = ler.nextDouble();
	System.out.print("Digite o valor de c: ");
	c = ler.nextDouble();
	
	r = Math.pow((a + b), 2);
	s = Math.pow((b + c), 2);
	d = (r + s)/2;
	
	System.out.printf("Resultado igual a " + d);
	
	ler.close();
	}

}

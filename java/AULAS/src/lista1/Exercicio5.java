/*
 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule
 *  a m�dia final deste aluno. Considerar que a m�dia � ponderada
 *   e que o peso das notas �: 2,3 e 5, respectivamente. 
 */

package lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String []arg) {
		
	Scanner ler = new Scanner(System.in);
	double a, b, c, m;
	
	System.out.print("Valor da nota A: ");
	a = ler.nextDouble();
	System.out.print("Valor da nota B: ");
	b = ler.nextDouble();
	System.out.print("Valor da nota C: ");
	c = ler.nextDouble();
	
	m = ((a*2)+(b*3)+(c*5))/(2+3+5);
	
	System.out.print("A m�dia do aluno � " + m);
	ler.close();
	
			
	}

}

package lista4;

import java.util.Scanner;

public class Exercicio2Aviao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Aviao exemplo1 = new Aviao();
		
		System.out.print("Digite o c�digo da aeronave: ");
		exemplo1.codigo = ler.nextInt();
		System.out.print("Digite a companhia da aeronave: ");
		exemplo1.companhia = ler.next();
		System.out.print("Digite o modelo da aeronave: ");
		exemplo1.modelo = ler.next();
		System.out.print("Digite quantas pessoas s�o passageiros: ");
		exemplo1.passageiros = ler.nextInt();
		System.out.print("Digite quantas pessoas pertencem a tripula��o: ");
		exemplo1.tripulacao = ler.nextInt();
		
		exemplo1.totalPassageiros();

	}

}

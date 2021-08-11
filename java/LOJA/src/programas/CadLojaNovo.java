package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		
		//Intege para inteiro
		Integer y=0;
		Double salario;
		String auxNome;
		
		int x=0;
		cadastro.add("SPFC");
		cadastro.add("Santos");
		cadastro.add("Palmeiras");
		cadastro.add("Corinthians");
		cadastro.add("Juventus");
		
		System.out.println("Tamanho da lista:" +cadastro.size());
		
		cadastro.add(1, "Guarani");
		
		System.out.println(cadastro.get(4));

		for (String time : cadastro) {
			System.out.println(x+" - "+time.toLowerCase());
			x++;
		}
		//SELECIONAR COM O NUMERO DA POSIÇÃO
		System.out.println("Digite o código do time que deseja: ");
		x=ler.nextInt();
		System.out.println("Voce escolheu o time: "+cadastro.get(x));
		
		System.out.println("Digite o código do time que deseja apagar: ");
		x=ler.nextInt();
		System.out.println("Voce escolheu o time: "+cadastro.get(x)+" este time será retirado da lista.");
		cadastro.remove(x);
		System.out.println("Nova lista!!");
		x=0;
		for (String time : cadastro) {
			System.out.println(x+" - "+time.toLowerCase());
			x++;
		}
		
		//SELECIONAR COM NOME
		System.out.println("Digite o nome do time que deseja apagar: ");
		auxNome=ler.next().toUpperCase();
		x = cadastro.indexOf(auxNome);
		System.out.println("Voce escolheu o time: "+cadastro.get(x)+" este time será retirado da lista.");
		cadastro.remove(x);
		System.out.println("Nova lista!!");
		
		x=0;
		for (String time : cadastro) {
			System.out.println(x+" - "+time.toLowerCase());
			x++;
		}
		
		/*Diminui a linha do código usando o própio programa
		for(String time:cadastro) {
			System.out.println(cadastro.indexOf(time)+" - "+time);
		}
		*/
		
		/*
		for (String time : cadastro) {
			System.out.println(time);
		}
		System.out.println("Tamanho da lista:" +cadastro.size());
		*/
	}
}

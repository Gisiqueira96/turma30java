package programas;

import java.util.Scanner;

import entidades.Doces;
import entidades.Livro;
import entidades.Revista;

public class CadBanca {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		/*
		 * Teste programador
		Revista rev1 = new Revista("004","Revista Craudia", 35.50 , 30, "Abril");
		
		Doces sugar1 = new Doces("010","Bala Yogurte",0.15,1000, "Doces Maria");

		Livro book1 = new Livro ("050","50 tons de cinza",10.00,40);
	
		book1.retiraEstoque(30);
		sugar1.retiraEstoque(2000);
		rev1.incluiEstoque(-100);
	
		System.out.println(book1.getNome()+" estoque: "+book1.getEstoque());
		*/
		
		System.out.print("Digite o código: ");
		String codigo = ler.next();
		ler.nextLine();
		System.out.print("Digite o nome do livro: ");
		String nome = ler.nextLine().toUpperCase();
		System.out.print("Digite o valor : ");
		double valor = ler.nextDouble();
		System.out.print("Digite o estoque inicial: ");
		int estoque = ler.nextInt();
		System.out.print("Digite a editora: ");
		String editora = ler.next().toUpperCase();
		
		
		Livro book1 = new Livro (codigo, nome, valor, estoque, editora);
		System.out.print(book1.getNome()+" tem no estoque "+ book1.getEstoque()+"\n");
		System.out.print("Vai querer quantos: ");
		int quantidade = ler.nextInt();
		System.out.print("Voce vai pagar "+book1.getValor()*quantidade);
		book1.retiraEstoque(quantidade);
		
	}

}

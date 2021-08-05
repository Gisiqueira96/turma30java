package introducao;

import java.util.Scanner;

public class TesteFuncao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int anoNascimento;
		String nome;
		
		int tamanho =50;
		linha(tamanho);
		System.out.print("Digite o nome: ");
		nome = ler.next();
		linha(80);
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = ler.nextInt();
		linhaBasica();
		System.out.printf("%s sua idade é %d\n" , nome , (2021 - anoNascimento));
		linhaBasica();
		System.out.print("Olha tu é " + tue(anoNascimento));
		
		//System.out.println(tue2(2005,2));
		ler.close();
	}
	
	
	
	public static void linhaBasica() {
		System.out.println("----------------------------------------------------");
	}
	
	public static void linha(int tamanho) {
		for(int x=1 ; x<=tamanho ; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static String tue(int ano) {
		
		int idade;
		idade = 2021 - ano;
		String resposta;
		if(idade<13) {
			resposta = "Criança";
		}
		else if(idade<18) {
			resposta = "Adolescente";
		}
		else if(idade<30) {
			resposta = "Jovem";
		}
		else if(idade<45) {
			resposta = "Adulto";
		} else {
			resposta = "Cringe";
		}
		return resposta;
	}
public static String tue2(int ano, int anoAtual) {
		
		int idade;
		idade = 2021 - ano;

		String resposta;
		if(idade<13) {
			resposta = "Criança";
		}
		else if(idade<18) {
			resposta = "Adolescente";
		}
		else if(idade<30) {
			resposta = "Jovem";
		}
		else if(idade<45) {
			resposta = "Adulto";
		} else {
			resposta = "Cringe";
		}
		return resposta;
	}
}

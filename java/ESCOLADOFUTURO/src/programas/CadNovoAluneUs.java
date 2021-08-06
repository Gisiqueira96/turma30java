package programas;

import java.util.Scanner;

public class CadNovoAluneUs {

	public static void main(String[] args) {
		
		//TESTE USUÁRIO
		Scanner ler = new Scanner(System.in);
		Aluno exemplo1 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		exemplo1.nome = ler.next();
		System.out.println("Digite a matricula: ");
		exemplo1.matricula = ler.next().toUpperCase();
		System.out.println("Digite o ano de nascimento: ");
		exemplo1.anoNascimento = ler.nextInt();
		
		System.out.println("Matricula "+exemplo1.matricula);
		System.out.println("Nome "+exemplo1.nome);
		exemplo1.mostraIdade(); //

	}

}

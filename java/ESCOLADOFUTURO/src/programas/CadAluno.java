package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String alunes [] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int nota [] = new int[alunes.length];
		String matriculas [] = new String [alunes.length];  //MAT-0X
		boolean ativo [] = new boolean [alunes.length];  //true
		char op = ' ';
		String matriculaAluno;
		
		//mostrar todo mundo
		//laço e pede:
		//pedir pela matricula 1 aluno
		//informar a nota deste aluno
		//informar se o aluno ainda continua ativo ou não [o usuário não pode digitar true or false]
		//tem que fazer o processo ate que a pergunta sim ou não seja não.
		//após mostrar todos os alunos com nota pela regra até 5-- estude mais, acima de 5 - ótimo, contunue assim
		//aluno inativo ou aluno ativo baseado no true ou false no ativo
		//somente dos alunos que tem nota
		
		for (int x=0 ; x<alunes.length ; x++) {
			
			if (x >= 9) {
				matriculas[x]="MAT-"+(x+1);
			} 
			else {
				matriculas[x]="MAT-0"+(x+1);
			}
			System.out.println(matriculas[x]+"\t"+alunes[x]);
		}
		do {
			System.out.print("Digite a matricula do alune: ");
			matriculaAluno = ler.next().toUpperCase();
			
		}while (op == 'S');
		
		
		
		
		
	}

}

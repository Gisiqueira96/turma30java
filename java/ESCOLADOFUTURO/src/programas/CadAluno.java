		//mostrar todo mundo
		//la�o e pede:
		//pedir pela matricula 1 aluno
		//informar a nota deste aluno
		//informar se o aluno ainda continua ativo ou n�o [o usu�rio n�o pode digitar true or false]
		//tem que fazer o processo ate que a pergunta sim ou n�o seja n�o.
		//ap�s mostrar todos os alunos com nota pela regra at� 5-- estude mais, acima de 5 - �timo, contunue assim
		//aluno inativo ou aluno ativo baseado no true ou false no ativo
		//somente dos alunos que tem nota

package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String alunes [] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias",
		"Anderson Coelho da Costa","Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira",
		"Beatriz Gomes de Abreu","Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana",
		"Enzo Fulaneto","Ester Gomes Neves Nascimento","F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva",
		"Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes",
		"Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins","Lucas Silva Nunes de Aguiar",
		"Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani",
		"Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa",
		"Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima",
		"Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int nota [] = new int[alunes.length];
		String matriculas [] = new String [alunes.length];  //MAT-0X
		boolean ativo [] = new boolean [alunes.length];  //true
		char op = ' ';
		String matriculaAlune;
		int notaAlune;
		char auxAtivo = ' ';
		
		
		//mostrar tabela
		for (int x=0 ; x<alunes.length ; x++) {
			ativo[x] = true;
			if (x >= 9) {
				matriculas[x]="MAT-"+(x+1);
			} 
			if (x < 9) {
				matriculas[x]="MAT-0"+(x+1);
			}
			System.out.print("Matricula: "+matriculas[x]+" Alunes: "+alunes[x]+"\t\tNotas: "+nota[x]+" Status: ");
			if (ativo[x] == true) {
				System.out.print(" Ativo \n");
			} 
			if (ativo[x] == false){
				System.out.print(" Inativo \n");
			}
		}
			
		do {
			//matricula do alune e imprima
			System.out.println();
			System.out.print("Digite a matricula do alune: ");
			matriculaAlune = ler.next().toUpperCase();
			//informar nota do alune
			System.out.print("Informe a nota do alune: ");
			notaAlune = ler.nextInt();
			//informar se alune esta ativo ou inativo
			System.out.print("Statud do alune (S-Ativo ou N-Inativo): ");
			auxAtivo = ler.next().toUpperCase().charAt(0);
			if (auxAtivo == 'S') {
				System.out.println("Status atualizado para ATIVO!");
			}else if (auxAtivo == 'N'){
				System.out.println("Status atualizado para INATIVO!");
			}else {
				System.out.println("Status inv�lido, digite S-Ativo ou N-Inativo");
			}
			System.out.print("Deseja continuar adicionando as notas S/N: ");
			op = ler.next().toUpperCase().charAt(0);
		}while (op == 'S');
		// notas atualizadas
		System.out.println("---MOSTRAR NOTAS---");
		for (int x=0 ; x<alunes.length ; x++) {
			if (nota != null) {
			System.out.println(matriculas[x]+"\t\t"+alunes[x]+"\t\t\t\t"+auxAtivo+"\t\t\t"+notaAlune);
			}
		}
		
		
	}

}

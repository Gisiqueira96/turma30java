/*
 * WHILE
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
 *  dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
 *  idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 *  e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.

 */

package lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		char sexo;  // (1-feminino / 2-masculino / 3-Outros)
		char opcao; // (1-pessoa calma / 2-pessoa nervosa / 3-pessoa agressiva)
		int contadorPessoas=0;
		final int LIMITE_PESSOAS_ENTREVISTADAS=3;
		
		int numeroPessoasCalmas=0; 
		int numeroMulheresNervosas=0; 
		int numeroHomensAgressivos=0; 
		int numeroOutrosCalmos=0;
		int numeroPessoasNervosasMais40Anos=0; 
		int numeroPessoasCalmasMenos18Anos=0;
		
		while(contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS) {
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			System.out.print("Digite \n1-Feminino\n2-Masculino\n3-Outros\nOpção: ");
			sexo = ler.next().charAt(0);
			System.out.print("Digite \n1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva\nOpção: ");
			opcao = ler.next().charAt(0);
			
			contadorPessoas++;
			
			if (opcao == '1') {
				numeroPessoasCalmas++;
			}
			if (sexo == '1' && opcao == '2') {
				numeroMulheresNervosas++;
			}
			if(sexo == '2' && opcao == '3') {
				numeroHomensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				numeroOutrosCalmos++;
			}
			if(opcao == '3' && idade>40) {
				numeroPessoasNervosasMais40Anos++;
			}
			if(opcao == '1' && idade<18 ) {
				numeroPessoasCalmasMenos18Anos++;
			}
			
		}
		System.out.println("Pessoas Calmas "+numeroPessoasCalmas);
		System.out.println("Mulheres Nervosas "+numeroMulheresNervosas);
		System.out.println("Homens agressivos "+numeroHomensAgressivos);
		System.out.println("Outros Calmos "+numeroOutrosCalmos);
		System.out.println("Pessoas nervosas acima dos 40 anos "+numeroPessoasNervosasMais40Anos); 
		System.out.println("Pessoas calmas abaixo dos 18 anos "+numeroPessoasCalmasMenos18Anos); 
		
		ler.close();
		
	}
}
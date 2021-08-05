package introducao;

import java.util.Scanner;

public class CopinhaVetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String codTime [] = new String[4];
		String nomesTimes[] = {"SANTOS      ","SPFC       ", "PALMEIRAS", "CORINTHIANS"}; // ou String nomesTimes[] = new String[4];
		int pontoTimes [] = {0,0,0,0}; // ou int pontosTimes [] = new int[4];
		char op =' ';
		String auxCod;
		
		//"CPF-01"
		for (int x=0 ; x<codTime.length  ; x++) {
			if (x == 9) {
				codTime[x]="CPF-"+(x+1);
			} 
			else {
			codTime[x]="CPF-0"+(x+1);
			}
		}
		System.out.println("\tINICIO DA TABELA");
		System.out.println("CODIGO\t\tTIME\t\tPONTOS");
		
		for(int x=0 ; x<codTime.length ; x++) {
			System.out.printf("%s\t\t%s\t%d\n", codTime[x], nomesTimes[x], pontoTimes[x]);
		}
		System.out.println();
		for(int x=0 ; x<3 ; x++) { // Laço que roda o numero de rodadas que você deseja.
			System.out.printf("Rodada " + (x+1) + " ");
			for (int y=0 ; y<codTime.length ; y++) { //Laço que roda todos os times.
				System.out.print("\n" + nomesTimes[y] + "G-ganhou , P-perdeu ou E-empatou: ");
				op = ler.next().toUpperCase().charAt(0);
				if (op == 'G') {
					pontoTimes[y] += 3;
				}
				else if (op == 'E') {
					pontoTimes[y] += 1;
				}
				else if (op == 'P') {
					pontoTimes[y] += 0;
				} else {
					System.out.print("Você não escolheu um código correto, ficará com ZERO!");
				}
			}
		}
		
		System.out.println("\t\tAPÓS 3 RODADAS");
		System.out.println("CODIGO\t\tTIME\t\tPONTOS");
		
		for(int x=0 ; x<codTime.length ; x++) {
			System.out.printf("%s\t\t%s\t%d\n", codTime[x], nomesTimes[x], pontoTimes[x]);
		}
		System.out.println();
		System.out.println("Digite o código do time que deseja selecionar: ");
		auxCod = ler.next().toUpperCase();
		
		System.out.println("CODIGO\t\tTIME\t\tPONTOS");
				
		for(int x=0 ; x<codTime.length ; x++) {
					
			if(auxCod.equals(codTime[x])) {
					System.out.printf("%s\t\t%s\t%d\n", codTime[x], nomesTimes[x], pontoTimes[x]);		
			}	
		}
		ler.close();
	}
}

package introducao;

import java.util.Scanner;


public class ExemploLacaRepeticaoCopinha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String time1="SANTOS", time2="SPFC", time3="PALMEIRAS", time4="CORINTHIANS";
		int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
		char op='X'; //G - ganhou=3, P - perdeu=0, E - empatou=1
		
		for (int x=1 ; x<=2 ; x++) {
			
			System.out.print("RODADA = " + x + "\n");
			System.out.print(time1+" -- G-ganhou, E-empatou ou P-perdeu: ");
			op=ler.next().toUpperCase().charAt(0);	
				if (op == 'G') {
					ponto1 += 3;
				}
				else if (op == 'E') {
					ponto1 += 1;
				}
				else if (op == 'P') {
					ponto1 += 0;
				}
				else {
					System.out.println("Digitou errado, ficará com 0!!");
				}
				System.out.print(time2+" -- G-ganhou, E-empatou ou P-perdeu: ");
				op=ler.next().toUpperCase().charAt(0);	
					if (op == 'G') {
						ponto2 += 3;
					}
					else if (op == 'E') {
						ponto2 += 1;
					}
					else if (op == 'P') {
						ponto2 += 0;
					}
					else {
						System.out.println("Digitou errado, ficará com 0!!");
					}
					System.out.print(time3+" -- G-ganhou, E-empatou ou P-perdeu: ");
					op=ler.next().toUpperCase().charAt(0);	
						if (op == 'G') {
							ponto3 += 3;
						}
						else if (op == 'E') {
							ponto3 += 1;
						}
						else if (op == 'P') {
							ponto3 += 0;
						}
						else {
							System.out.println("Digitou errado, ficará com 0!!");
						}
						System.out.print(time4+" -- G-ganhou, E-empatou ou P-perdeu: ");
						op=ler.next().toUpperCase().charAt(0);	
							if (op == 'G') {
								ponto4 += 3;
							}
							else if (op == 'E') {
								ponto4 += 1;
							}
							else if (op == 'P') {
								ponto4 += 0;
							}
							else {
								System.out.println("Digitou errado, ficará com 0!!");
							}
			}
				System.out.println();
				System.out.println("\t\t\tTABELA");
				System.out.println();
				System.out.printf("Time: %s \t\tpontos atuais: %d Ponto(s)!!\n",time1, ponto1);
				System.out.printf("Time: %s \t\tpontos atuais: %d Ponto(s)!!\n",time2, ponto2);
				System.out.printf("Time: %s \tpontos atuais: %d Ponto(s)!!\n",time3, ponto3);
				System.out.printf("Time: %s \tpontos atuais: %d Ponto(s)!!\n",time4, ponto4);
				
				ler.close();
	}

}

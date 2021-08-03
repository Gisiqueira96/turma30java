import java.util.Scanner;

public class CalculoImpContribuinte {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		char genero;
		double salario;
		double impost;
		double total;
		
		System.out.print("Digite o nome: ");
		nome = ler.nextLine().toUpperCase();
		System.out.print("Selecione M-masculino, F-femenido ou E-neutro: ");
		genero = ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o sal�rio: ");
		salario = ler.nextDouble();
		
		if (salario < 0) {
			System.out.println("Esse sal�rio n�o � v�lido!!");
		}
		else if (salario <= 2000) {
			System.out.println("Voc� est� isento do importo.");
		}
		else if (salario > 2000 || salario >= 5000) {
			System.out.print("\nValor do importo �: " + (salario*0.15));
			System.out.print("\nValor do sal�rio com o importo �: " + (salario - (salario*0.15)));
		}
		else if (salario > 5000) {
			System.out.print("\nValor do importo �: " + (salario*0.25));
			System.out.print("\nValor do sal�rio com o importo �: " + (salario - (salario*0.25)));
		}
		ler.close();
		
	}

}

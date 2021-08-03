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
		System.out.println("Digite o salário: ");
		salario = ler.nextDouble();
		
		if (salario < 0) {
			System.out.println("Esse salário não é válido!!");
		}
		else if (salario <= 2000) {
			System.out.println("Você está isento do importo.");
		}
		else if (salario > 2000 || salario >= 5000) {
			System.out.print("\nValor do importo é: " + (salario*0.15));
			System.out.print("\nValor do salário com o importo é: " + (salario - (salario*0.15)));
		}
		else if (salario > 5000) {
			System.out.print("\nValor do importo é: " + (salario*0.25));
			System.out.print("\nValor do salário com o importo é: " + (salario - (salario*0.25)));
		}
		ler.close();
		
	}

}

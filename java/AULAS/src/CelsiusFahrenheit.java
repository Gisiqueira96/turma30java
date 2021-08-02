import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double c;
		double f;
		String nome;
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite a temperatura em celcius: ");
		c = leia.nextDouble();
		f = ((9*c+160)/5);
		System.out.println("Oi "+nome+", a temperatura de celcius é "+ c + " para fahrenheit " + f);
		leia.close();
	}
}

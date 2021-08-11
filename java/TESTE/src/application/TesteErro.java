package application;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int valor;
		int valores[] = new int[4]; // 0-3

		/*
		 * try {
		 * 
		 * } catch (erro){ tratar de alguma forma esse erro }
		 */

		try {
			System.out.println("Digite a posi��o dentro do vetor 0-3: ");
			valor = ler.nextInt();
			System.out.println("Digite um, valor inteiro:");
			valores[valor] = ler.nextInt();

			System.out.printf("O valor digitado na posi��o %d foi %d !!", valor, valores[valor], "\n");
			System.out.println("\nO valor dadivis�o teste: " + valores[valor] / valor);
			//System.exit(0);

		} catch (Exception erro) { // Exception(pega apenas da classe Exception) ou Throwable (pega TODOS os erros)
			System.out.println("\nVoce errou!!");

			System.out.println(erro.getMessage());
			erro.printStackTrace();
			//System.exit(0); [para derrubar o programa em qualquer parte]
			
		} finally { // fa�a isso independente do que aconte�a
			System.out.println("Fechando o teclado!!");
			ler.close();
		}
		/*
		 * catch (java.lang.ArithmeticException erro) {
		 * System.out.println("\nImposs�vel dividir por zero!!"); } catch
		 * (java.util.InputMismatchException erro) {
		 * System.out.println("Digite um n�mero inteiro por favor!!"); } catch
		 * (java.lang.ArrayIndexOutOfBoundsException erro) {
		 * System.out.println("O tamanho do vetor � de 0-3. Digite novamente!!"); }
		 */

		System.out.println("Fim de programa!!");
	}

}

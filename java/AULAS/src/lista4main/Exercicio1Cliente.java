/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
 *  esta classe, em seguida crie um objeto cliente, defina as instancias deste
 *   objeto e apresente as informa��es deste objeto no console.
 */

package lista4main;

import java.util.Scanner;

import lista4class.Cliente;

public class Exercicio1Cliente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.print("Digite o nome do cliente: ");
		cliente1.nome = ler.next();
		System.out.print("Digite o c�digo do cliente: ");
		cliente1.codigo = ler.nextInt();
		System.out.print("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento = ler.nextInt();
		
		System.out.println("Nome: "+cliente1.nome);
		System.out.println("C�digo: "+cliente1.codigo);
		cliente1.calculoIdade();
		
	}

}
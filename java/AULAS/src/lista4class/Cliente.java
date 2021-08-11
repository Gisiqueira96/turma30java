/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
 *  esta classe, em seguida crie um objeto cliente, defina as instancias deste
 *   objeto e apresente as informações deste objeto no console.
 */

package lista4class;

public class Cliente {

	//Atributos
	public String nome;
	public int codigo;
	public int anoNascimento;
	
	//metodos
	public void calculoIdade() {
		System.out.println("Idade: "+(2021-anoNascimento));
	}
}
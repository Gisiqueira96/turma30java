package lista5class;

public class Animal {

	private String nome;
	private int idade;
	private boolean emiteSom;
	
	
	
	public Animal(String nome, int idade, boolean emiteSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		if (idade<=0) {
			System.out.println("Idade Inv�lida!");
		}
		this.emiteSom = emiteSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emiteSom() {
		System.out.println("Emitindo som do animal..");
	}
}

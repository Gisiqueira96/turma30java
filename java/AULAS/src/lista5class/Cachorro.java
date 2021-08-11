package lista5class;

public class Cachorro extends Cavalo {

	public Cachorro(String nome, int idade, boolean emiteSom, boolean corre) {
		super(nome, idade, emiteSom, corre);
		
	}
	@Override
	public void emiteSom() {
		System.out.println("Au Au Au Au Au Au");
	}
}


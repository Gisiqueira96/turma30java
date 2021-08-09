package clases;

public class Pregui�a extends Animal {

	private boolean sobeArvore;

	public Pregui�a(String nome, int idade, boolean emiteSom, boolean sobeArvore) {
		super(nome, idade, emiteSom);
		this.sobeArvore = sobeArvore;
	}

	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	
	
}

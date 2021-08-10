package entities;

public class Gato extends Pet {
	
	private boolean miadoAlto;

	public Gato(String raca, boolean miadoAlto) {
		super(raca);
		this.miadoAlto = miadoAlto;
	}

	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	//encapsulamento
	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	@Override  //annotetion - pega o msm método da mãe e modifica adaptando para a classe filha
	public void emiteSom() {
		if (miadoAlto == true) {
			System.out.println("MIAU MIAU MIAU MIAU MIAU MIAU");
		}
		else {
			System.out.println("miau miau miau miau miau miau");
		}
		
	}
	
	
}

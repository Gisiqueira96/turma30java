package entities;

public class Porco implements Sons {

	private boolean pesado;

	public Porco(boolean pesado) {
		super();
		this.pesado = pesado;
	}

	@Override
	public void somAlto() {
		System.out.println("OINC OINC OINC");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("oinc oinc oinc");
		
	}
	
	
}

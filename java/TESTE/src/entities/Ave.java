package entities;

public class Ave extends Pet implements Sons {

	private boolean voa;

	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa = voa;
	}

	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}

	//encapsulamento
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}

	@Override
	public void somAlto() {
		System.out.println("PIU PIU PIU PIU");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("piu piu piu piu");
		
	}

	
	
}

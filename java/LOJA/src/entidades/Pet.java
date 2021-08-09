package entidades;

public class Pet extends Animal {
	
	private String raca;
	private char porte; //P - M - G
	
	
	public Pet(String especie, String raca, char porte) {
		super(especie);
		this.raca = raca;
		this.porte = porte;
		
	}
}

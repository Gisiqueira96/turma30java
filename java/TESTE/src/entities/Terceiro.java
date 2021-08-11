package entities;

public class Terceiro extends Funcionario {
	
	//Atributos
	private double adicional;

	//Construtor
	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	//Encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Método annotation
	@Override //no protected voce consegue mexer
	public double calcSalario() {
		return horasTrabalhadas * valorPorHora+adicional;
	}
	/*@Override [no super apenas leva]
	public double calcSalario() {
		return (super.getHorasTrabalhadas() * super.getValorPorHora()) + adicional;
	}*/
}

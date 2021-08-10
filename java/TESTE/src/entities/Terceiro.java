package entities;

public class Terceiro extends Funcionario {

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
	
	//Método
	@Override
	public double salario() {
		return ((super.getValorPorHora() * super.getValorPorHora()) + adicional);
	}
}

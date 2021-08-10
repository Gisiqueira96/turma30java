package entities;

public class Funcionario {
	
	private String matricula;
	private double horasTrabalhadas;
	private double valorPorHora;
	
	//Construtor
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	//Encapsulamento
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	//Método
	public double calcSalario() {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		return horasTrabalhadas * valorPorHora;
	}
}

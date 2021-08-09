package classes;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(int numero, String nomeCliente, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}


	
}

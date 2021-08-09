package classes;

public final class ContaPoupanca extends Conta {
	
	private int diaAniversario;

	public ContaPoupanca(int numero, String nomeCliente, int diaAniversario) {
		super(numero, nomeCliente);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void correcao (int diaAtual) {
		if(diaAtual == diaAniversario) {
			super.credito(super.getSaldo()*0.05);
		}
	}
}

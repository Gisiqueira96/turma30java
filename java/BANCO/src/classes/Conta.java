package classes;

public class Conta {

		private int numero;
		private String nomeCliente;
		private double saldo;
		
		
		public Conta(int numero, String nomeCliente) {
			super();
			this.numero = numero;
			this.nomeCliente = nomeCliente;
		}
		
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public double getSaldo() {
			return saldo;
		}

		/*public void setSaldo(double saldo) {
			this.saldo = saldo;
		}*/
		
		public void debito(double valor) {
			if (valor < 0){
				System.out.println("Valor negativo impossivel realizar");
			}
			if (valor > saldo) {
				System.out.println("Impossível realizar..");
			}
			else {
				this.saldo -=valor;
			}
			
		}
		public void credito(double valor) {
			if (valor < 0) {
				System.out.println("Valor informado Inválido..");
			}
			else {
				this.saldo +=valor;	
			}
		}
	}
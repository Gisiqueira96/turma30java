package entities;

public class Cachorro extends Pet {
	
		private boolean latidoAlto;

		public Cachorro(String raca, boolean latidoAlto) {
			super(raca);
			this.latidoAlto = latidoAlto;
		}

		public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
			super(raca, anoNascimento);
			this.latidoAlto = latidoAlto;
		}

		//encapsulamento
		public boolean isLatidoAlto() {
			return latidoAlto;
		}

		public void setLatidoAlto(boolean latidoAlto) {
			this.latidoAlto = latidoAlto;
		}
		
		@Override  //annotetion - pega o msm método da mãe e modifica adaptando para a classe filha [só acontece nas classes filhas] (POLIMORFISMO)
		public void emiteSom() {
			if (latidoAlto == true) {
				System.out.println("AU AU AU AU AU AU");
			}
			else {
				System.out.println("au au au au au au");
			}
		}
}

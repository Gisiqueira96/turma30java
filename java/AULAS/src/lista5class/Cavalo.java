package lista5class;


	public class Cavalo extends Animal{

		private boolean corre;

		public Cavalo(String nome, int idade, boolean emiteSom, boolean corre) {
			super(nome, idade, emiteSom);
			this.corre = corre;
		}

		public boolean isCorre() {
			return corre;
		}

		public void setCorre(boolean corre) {
			this.corre = corre;
		}
		
		@Override
		public void emiteSom() {
			System.out.println("IIIIrrríiiii, rilinchin");
		}
	}

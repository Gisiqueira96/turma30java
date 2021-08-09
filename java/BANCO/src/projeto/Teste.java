package projeto;

import classes.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		ContaPoupanca cc1 = new ContaPoupanca(1,"Carlos",1);

		cc1.credito(100);
		
		System.out.println("Saldo atual R$: "+ cc1.getSaldo());
		
		cc1.debito(0);
	}

}

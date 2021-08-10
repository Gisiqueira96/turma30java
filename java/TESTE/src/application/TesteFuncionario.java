package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Terceiro f1 = new Terceiro ("001" , 80 , 30.0 , 0.0);
		Funcionario f2 = new Funcionario ("002" , 80 , 30.0);
		
		System.out.println("SALARIO: " + f2.salario());
		
	}
}

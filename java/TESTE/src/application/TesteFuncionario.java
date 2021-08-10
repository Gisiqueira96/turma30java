package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Terceiro f1 = new Terceiro ("999",8,88.5,150.40);
		Funcionario f2 = new Funcionario ("222",8,88.5);
		
		System.out.println("SALARIO: " + f1.calcSalario());
		System.out.println("SALARIO: " + f2.calcSalario());
		
	}
}

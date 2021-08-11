package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		List<Funcionario> folha = new ArrayList<>();
		
		char tipo;
		String matricula;
		int horasTrabalhadas;
		double valorPorHora;
		double adicional;
		char op;
		
		do {
			System.out.println("Funcionário F-funcionario ou T-terceiro: ");
			tipo = ler.next().toUpperCase().charAt(0);
			System.out.println("Digite a matricula: ");
			matricula = ler.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas: ");
			horasTrabalhadas = ler.nextInt();
			System.out.println("Digite o valor por hora: R$ ");
			valorPorHora = ler.nextDouble();
			if(tipo == 'T') {
				System.out.println("Digite o valor do adicional: R$ ");
				adicional = ler.nextDouble();
				folha.add(new Terceiro (matricula,horasTrabalhadas,valorPorHora,adicional));
			} else if (tipo == 'F') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorPorHora));
			}
			
			System.out.println("Continua S/N: ");
			op = ler.next().toUpperCase().charAt(0);
			
			
		} while(op == 'S');
		
		for (Funcionario func : folha) {
			System.out.printf("%s seu salario é R$ %.2f\n",func.getMatricula(),func.calcSalario());
		}
	}
}

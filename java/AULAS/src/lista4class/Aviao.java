package lista4class;

public class Aviao {

	public int codigo;
	public String companhia;
	public String modelo;
	public int passageiros;
	public int tripulacao;

	
	public void totalPassageiros() {
		System.out.println("O total de passageiros nesse vôo: "+(passageiros+tripulacao));
	}
}
package lista4;

public class Aviao {

	public int codigo;
	public String companhia;
	public String modelo;
	public int passageiros;
	public int tripulacao;

	
	public void totalPassageiros() {
		System.out.println("O total de passageiros nesse v�o: "+(passageiros+tripulacao));
	}
}

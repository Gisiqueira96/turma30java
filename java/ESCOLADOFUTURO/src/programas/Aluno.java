package programas;

public class Aluno {

	//atributos
	//sobrecarga - mais do mesmo
	//construtores
	//encapsulamento - segurança - getters and setters
	// metodos
	
	//polimorfismo
	//herança
	//abstração
	//delegação
	//override - annotation
	
	
	//atributos
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	
	
	//metodo
	public void mostraIdade() {
		System.out.println("a idade é "+(2021-anoNascimento));
	}
	
	//sobrecarga de metodo (solicita a informação dentro do programa)
	public void mostraIdade(int anoAtual) {
		System.out.println("a idade é "+(anoAtual-anoNascimento));
	}
	public void mostraIdade(int anoAtual,int anoNascimento) {
		if (anoNascimento != this.anoNascimento) {
			System.out.println("Voce trocou o ano de nascimento OK??");
		}
		System.out.println("a idade é "+(anoAtual-anoNascimento));
	}

	
}

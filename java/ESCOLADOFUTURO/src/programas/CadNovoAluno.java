package programas;

public class CadNovoAluno {

	public static void main(String[] args) {
		
		//instanciar um aluno (criar um aluno para teste)
		
		//TESTE DE PROGRAMADOR
		Aluno exemplo1 = new Aluno();
		Aluno exemplo2 = new Aluno();
		
		exemplo1.nome = "EPAMINONDAS";
		exemplo1.matricula = "MAT-1";
		exemplo1.nota = 8;
		exemplo1.anoNascimento = 2005;
		
		exemplo2.nome = "Maria";
		exemplo2.matricula = "MAT-200";
		exemplo2.nota = 7;
		exemplo2.anoNascimento = 1978;
		
		/*System.out.println(exemplo2.nome+" "+exemplo2.matricula);
		if(exemplo2.nota >= 5) {
			System.out.println("Continue assim!!");
		}*/
	
		/*if (exemplo1.nota > exemplo2.nota) {
			System.out.println("A maior nota é de alune "+exemplo1.nome+ " e sua idade é "+(2021 - exemplo1.anoNascimento));
		}
		else {
			System.out.println("A maior nota é de alune "+exemplo2.nome+ " e sua idade é "+(2021 - exemplo2.anoNascimento));
		}*/
		
		exemplo1.mostraIdade();; //informa o ano atual (sobrecarga de método)
		exemplo2.mostraIdade(); //vazio (metodo)
		exemplo2.mostraIdade(2050); //informa o ano atual (sobrecarga de método)
		exemplo2.mostraIdade(2050, 1920); //informa o ano atual e o ano de nascimento [sem o IF] (sobrecarga de método)

		exemplo2.mostraIdade(2021, 1980);  //informa o ano atual, ano de nascimento e se modificou do atributo (sobrecarga de método)
	}	
}

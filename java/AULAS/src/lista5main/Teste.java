package lista5main;

import lista5class.Cachorro;
import lista5class.Cavalo;
import lista5class.Preguica;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro ("Nina", 5 , true , true);
		Cavalo an1 = new Cavalo("Pocotó", 8 , true , true);
		Preguica prigui1 = new Preguica ("Soneca" , 6 , true , true);
		
		System.out.printf("Nome : %s Idade: %d Sobe em árvore: %b\n",dog1.getNome(),dog1.getIdade(),dog1.isCorre());
		dog1.emiteSom();
		System.out.printf("Nome : %s Idade: %d Sobe em árvore: %b\n",an1.getNome(),an1.getIdade(),an1.isCorre());
		an1.emiteSom();
		System.out.printf("Nome : %s Idade: %d Sobe em árvore: %b\n",prigui1.getNome(),prigui1.getIdade(),prigui1.isSobeArvore());
		prigui1.emiteSom();
	}

}

package programas;

import entidades.Cachorro;
import entidades.Gato;

public class CadBichos {

	public static void main(String[] args) {
		
		/*CLASSE ABSTRATA - Funciona normalmente, mas não pode ser instânciada/criada dentro do programa, deve-se usar as classes lhas dentro do programa
		Animal bichi1= new Animal("Canino");
		*/
		
		Cachorro dog1 = new Cachorro("Canino","Doberman",'G',"Fina");
		Gato cat1 = new Gato ("Felino", "SLA" , 'M', "Alta");
		
		dog1.somAlto();
		dog1.somBaixo();
		cat1.somAlto();
		cat1.somBaixo();
	}

}

package programas;

import classe.Site;

public class DevSaudavel {

	public static void main(String[] args) {
		Site prod1 = new Site("G3-1","Glutamina", 30.0, 10);
		
		prod1.incluiEstoque(-246);
		System.out.println(prod1.getEstoque());
	
	}
}

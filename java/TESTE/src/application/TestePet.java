package application;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;
import entities.Porco;

public class TestePet  {

	public static void main(String[] args) {
		
		// TESTE PROGRAMADOR
		/*
		Pet animal1 = new Pet("Angorra",2019);
		
		animal1.setPorte('M');
		
		System.out.println(animal1.getRaca());
		System.out.println("Idade do Pet: "+(2021 - animal1.getAnoNascimento())+" anos.");
		animal1.emiteSom();
		System.out.printf("A idade é %d anos.",animal1.idade(2021));
		
		//Cachorro - Pet - latidoAlto (vdd ou falso) - construtor
		//Gato - Pet - miadoAlto (vdd ou falso) - construtor
		//Ave - Pet - Voa (vdd o falso) - construtor
		*/
		
		Cachorro pet1 = new Cachorro("PITBULL",true);
		Gato pet2 = new Gato("Siames",2014,true);
		Porco pig51 = new Porco(true);
		Ave pet3 = new Ave("Papaguaio",true);
		
		pet1.setAnoNascimento(2019);
		System.out.println(pet1.getRaca()+" - A idade do pet 1 é: "+pet1.idade(2021));
		pet1.emiteSom();
		System.out.println(pet2.getRaca()+" - A idade do pet 2 é: "+pet2.idade(2021));
		pet2.emiteSom();
		
		
	}

}

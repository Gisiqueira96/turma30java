package DevSaudavel;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

public class Teste extends Funcoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String auxCod;
		int contador = 0;
		int auxQuant = 0;
		

		List<Produto> lista = new ArrayList<>();	
		
		lista.add(new Produto("G3-01","Glutamina",30.00,10));
		lista.add(new Produto("G3-02","Vitamina C",15.00,10));
		lista.add(new Produto("G3-03","Regata Cav",45.00,10));
		lista.add(new Produto("G3-04","Tenis Sports",100.00,10));
		lista.add(new Produto("G3-05","Whey Prot",75.00,10));
		lista.add(new Produto("G3-06","Snacks Div",10.00,10));
		lista.add(new Produto("G3-07","C.Legging",80.00,10));
		lista.add(new Produto("G3-08","Camiseta",25.00,10));
		lista.add(new Produto("G3-09","BCAA CAPS",50.00,10));
		lista.add(new Produto("G3-10","Corda P.",22.00,10));
		
		apresentaTabela(lista);
		
		
			System.out.print("\nDigite o código do produto : ");
			auxCod = ler.nextLi().toUpperCase();
		
			for(contador = 0;contador < lista.size();contador++) {
				if(lista.get(contador).getCodProduto().equals(auxCod)) {
					
					System.out.println("Código : "+ lista.get(contador).getCodProduto() + "\nProduto : "+ lista.get(contador).getProduto() +
							"\nValor : "+ lista.get(contador).getPreco()+"\nEstoque : "+lista.get(contador).getEstoque());
					
					System.out.print("\nDigite a quantidade desejada : ");
					auxQuant = ler.nextInt();
					while (auxQuant<=0) {
				 		System.out.print("Valor inválido, digite novamente: ");
				 		auxQuant = ler.nextInt();
				 		}
				}	
			}	
	}	
}	

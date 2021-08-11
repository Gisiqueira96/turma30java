package programaEcommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classeEcommerce.Funcao;
import classeEcommerce.Produto;

public class Teste extends Funcao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);


				entraNosite();
				
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
				for (Produto item : lista) {
						System.out.print(item.getCodProduto()+"\t"+item.getProduto()+"\t\t"+item.getPreco()+"\t\t"+item.getEstoque()+"\n");
					}	
			}

		}

package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Doces;
import entidades.Livro;
import entidades.Produto;
import entidades.Revista;

public class CadProd {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		Revista rev1 = new Revista("001","exame",50.00,10,"ABRIL");
		
		lista.add(new Revista("001","exame",50.00,10,"ABRIL"));
		lista.add(new Livro ("010","Harry Potter",10.00,30,"Servant"));
		lista.add(new Doces("007","Bala DADINHO",0.10,100,"Dadinho doces"));
		System.out.println("CÓD\tVALOR\tESTOQUE\tPRODUTO");
		
		for (Produto item : lista) {
			System.out.println(item.getCodigo()+"\t"+item.getValor()+"\t"+item.getEstoque()+"\t"+item.getNome());
		}
	}
}

package programas;

import entidades.Produto;

public class CadLoja {
	
	public static void main(String[] args) {
		
		Produto prod1 = new Produto ("001","Camisa");
		Produto prod2 = new Produto ("002", "calça", 100.50 , -1);
		
		prod1.setNome("Camiseta");
		prod2.setValor(100);
		
		/*
		System.out.println(prod1.getNome());
		System.out.println(prod2.getValor()*2);
		*/
		
		prod2.retiraEstoque(5);
		prod1.incluiEstoque(-1);
		System.out.println(prod2.getEstoque());
		System.out.println(prod1.getNome()+"quant "+prod1.getEstoque());
		System.out.println(prod2.getNome()+"quant "+prod2.getEstoque());
		prod2.retiraEstoque(2);
		System.out.println(prod2.getNome()+"quant "+prod2.getEstoque());
		prod2.retiraEstoque(5);
		System.out.println(prod2.getNome()+"quant "+prod2.getEstoque());
	}
}

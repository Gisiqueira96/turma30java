package entities;

import java.util.List;

public class Carrinho extends Produto {
	private int quantidade;
	
    public Carrinho(String codProduto, String produto, double preco, int quantidade) {
        super(codProduto, produto, preco, quantidade);
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
            }
        }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /*
    public void verificarRepeticao(List<Produto> lista, int contador, int auxCod, ) {
    	for (contador = 0; contador < 10; contador++) {
				if (auxCod.equals(codProduto(contador))) {
				carrinhoCompras[contador] = auxQuant;
				tituloCarrinho(); //Maic
					for (contador = 0; contador < 10; contador++) {
						if(carrinhoCompras[contador] != 0) {
							System.out.print("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ♥\n");			
						}
					}
				//linha(false); //Maic
				}
			}
    	
    }
    */

}

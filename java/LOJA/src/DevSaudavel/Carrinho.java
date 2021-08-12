package DevSaudavel;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Carrinho extends Produto {
	List<Carrinho> carrinho = new ArrayList<>();
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
    
    
    

}

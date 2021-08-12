package entities;


public class Produto {
	//========================ATRIBUTOS=========================
	private String codProduto;
	private String produto;
	private double preco;
	private int estoque;
	
	//============================ CONSTRUTORES ================================
	
	public Produto (String codProduto, String produto, double preco, int estoque) {		
		super();
		this.codProduto = codProduto;
		this.produto = produto;
		this.preco = preco;
		this.estoque = estoque;
		if (estoque < 0) {
            this.estoque = 0;
        }
        else {
            this.estoque = estoque;
        }
	}

	//============================ GETTERS AND SETTERS ================================
	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	/*public void setPreco(double preco) {
		this.preco = preco;
	}*/

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	//============================ MÉTODOS ESTOQUE ================================
	
	public void incluiEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade incorreta!!! Tente de novo!!!");
        } else {
            this.estoque = this.estoque + quantidade;
        }

    }

    public void retiraEstoque(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Quantidade indisponivel");
        } else {
            this.estoque = this.estoque - quantidade;
        }
    }


}

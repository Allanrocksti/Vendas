package classes;

public class Produto {

	private String descricao;
	private float preco;
	
	public Produto(String descricao, float preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
}

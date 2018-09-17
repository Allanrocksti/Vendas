package classes;

import java.util.List;

public interface Catalogo {
	
	List<Produto> listarProdutos(float precoMin, float precoMax);
	List<Produto> listarProdutos(String nome);

}

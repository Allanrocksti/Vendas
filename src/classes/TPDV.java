package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPDV implements Catalogo {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	private List<Venda> vendas = new ArrayList<Venda>();
	
	@Override
	public List<Produto> listarProdutos(float precoMin, float precoMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listarProdutos(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void iniciarVenda() {
		
		Venda venda = new Venda();
		venda.setData(new Date(System.currentTimeMillis()));
		
		Produto produto1 = new Produto("Café", 4.9F);
		ItemVenda item1 = new ItemVenda(5, produto1);
		venda.addItemVenda(item1);
		
		Produto produto2 = new Produto("Açúcar", 2.2F);
		ItemVenda item2 = new ItemVenda(10, produto2);
		venda.addItemVenda(item2);
		
		Produto produto3 = new Produto("Macarrão", 1.4F);
		ItemVenda item3 = new ItemVenda(7, produto3);
		venda.addItemVenda(item3);
		
		venda.finalizarVenda();
		
		this.vendas.add(venda);
		
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

}

package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;
	private List<ItemVenda> lancamentos = new ArrayList<ItemVenda>();
	
	public float total() {
		float subtotal = 0;
		
		for (ItemVenda item : lancamentos) {
			subtotal += item.subtotal();
		}
		
		return subtotal;
	}
	
	public void addItemVenda(ItemVenda item) {
		lancamentos.add(item);
	}
	
	public String finalizarVenda() {
		
		String string = "         VENDA         \n";
				
		for (ItemVenda item : lancamentos) {
			string += "\n" + item.getQuantidade() + " - " + item.getProduto().getDescricao() + " - " + item.getProduto().getPreco();
		}
		
		string += "\n\nTotal: "  + this.total();
		
		return string;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}

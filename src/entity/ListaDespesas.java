package entity;

import java.util.ArrayList;
import java.util.List;

public class ListaDespesas {
	private List<Despesa> listaDespesa;	
	
	public ListaDespesas() {
		listaDespesa = new ArrayList<Despesa>();
	}

	public void adicionarDespesaNaLista(Despesa despesa){
		listaDespesa.add(despesa);
	}	

	public List<Despesa> getListaDespesa() {
		return listaDespesa;
	}

	public void setListaDespesa(List<Despesa> listaDespesa) {
		this.listaDespesa = listaDespesa;
	}

	@Override
	public String toString() {
		return "ListaDespesas [listaDespesa=" + listaDespesa + ", toString()=" + super.toString() + "]";
	}
	
	

}

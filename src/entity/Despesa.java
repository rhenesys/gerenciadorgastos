package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Despesa {
	
	private Integer id;
	private String descricao;
	private double valorTotal;
	private Date data;
	private boolean parcelado;
	private Categoria categoria;
	private ListaDespesas despesaLista;
	
	public Despesa() {}
	public Despesa(Integer id, String descricao, double valorTotal, Date data, boolean parcelado, Categoria categoria) {
		this.id = id;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.data = data;
		this.parcelado = parcelado;
		this.categoria = categoria;
		if(despesaLista == null)
			despesaLista = new ListaDespesas();
		//despesaLista = new ListaDespesas();
		//adicionaDespesa(this);
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public boolean isParcelado() {
		return parcelado;
	}



	public void setParcelado(boolean parcelado) {
		this.parcelado = parcelado;
	}



	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	public ListaDespesas getDespesaLista() {
		return despesaLista;
	}



	public void setDespesaLista(ListaDespesas despesaLista) {
		this.despesaLista = despesaLista;
	}
	

	public void adicionaDespesa(Despesa d) {		
			despesaLista.adicionarDespesaNaLista(d);
	}
	@Override
	public String toString() {
		String s = "";
		s += "Despesa= {\nid: "+ id + ",\ndescricao = " + descricao + ",\nvalorTotal = " + valorTotal + ",\ndata = " + data
				+ ",\nparcelado = " + parcelado + ",\n" + categoria.toString() + "}";
				
		return s;
	}



	
	
	
}


package entity;

import java.util.Date;

public class DespesaVencimento extends Despesa {
	private boolean pago;

	public DespesaVencimento(Despesa despesa) {
		super(despesa.getId(), despesa.getDescricao(), despesa.getValorTotal(), despesa.getData(), despesa.isParcelado(), despesa.getCategoria());
		this.pago = false;
		adicionaDespesa(this);
	}

	public DespesaVencimento(Integer id, String descricao, double valorTotal, Date date, Categoria categoria, boolean parcelado, boolean pago) {
		super(id, descricao, valorTotal, date, parcelado, categoria);
		this.pago = pago;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	@Override
	public void adicionaDespesa(Despesa d) {
		Despesa newDespesa = new DespesaVencimento(super.getId(), super.getDescricao(),
				super.getValorTotal(),new Date(super.getData().getYear(),super.getData().getMonth(), super.getData().getDay()),
				super.getCategoria(),super.isParcelado(), this.pago);
		super.adicionaDespesa(newDespesa);
	}
	
	

}

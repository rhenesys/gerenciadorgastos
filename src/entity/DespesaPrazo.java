package entity;

import java.util.Date;

public class DespesaPrazo extends Despesa{
	private Integer numeroDeParcelas;
	private double valorDasParcelas;
	private int parcelasPagas;
	
	
	public DespesaPrazo(Despesa despesa, Integer numeroDeParcelas) {
		super(despesa.getId(), despesa.getDescricao(), despesa.getValorTotal(), despesa.getData(), despesa.isParcelado(), despesa.getCategoria());
		this.numeroDeParcelas = numeroDeParcelas;
		this.parcelasPagas = 0;
		this.valorDasParcelas = 0.0;
		if(super.isParcelado()) {
			this.valorDasParcelas = calculaValorDasParcelas();
			for(int i=0; i<numeroDeParcelas; i++) {				
				super.adicionaDespesa(mesesParcelado());;		
			}
		}else {
			this.valorDasParcelas = 0.00;
		}
	}

	public DespesaPrazo(Integer id,
				String descricao,
				double valorTotal,
				Date data,
				Categoria categoria,
				boolean parcelado,
				Integer numeroDeParcelas,
				double valorDasParcelas,
				int parcelasPagas) {
		super(id, descricao, valorTotal, data, parcelado, categoria);
		this.numeroDeParcelas = numeroDeParcelas;
		this.valorDasParcelas = valorDasParcelas;
		this.parcelasPagas = parcelasPagas;
	}
	

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public double getValorDasParcelas() {
		return valorDasParcelas;
	}

	public void setValorDasParcelas(double valorDasParcelas) {
		this.valorDasParcelas = valorDasParcelas;
	}

	public int getParcelasPagas() {
		return parcelasPagas;
	}

	public void setParcelasPagas(int parcelasPagas) {
		this.parcelasPagas = parcelasPagas;
	}

	public double calculaValorDasParcelas() {		
		return super.getValorTotal()/this.numeroDeParcelas;
	}
	
	public Despesa mesesParcelado() {
		int mes = this.getData().getMonth();
		Despesa d1;
		if(numeroDeParcelas + mes < 12) {
			d1 = new DespesaPrazo(super.getId(), super.getDescricao(), super.getValorTotal(),
					new Date(super.getData().getYear(), mes+parcelasPagas, super.getData().getDay()),
					super.getCategoria(),super.isParcelado(), this.numeroDeParcelas, this.valorDasParcelas, this.parcelasPagas);			
			parcelasPagas++;
			return d1;
		}else {
			//TODO: fazer para > 12 
			d1 = new DespesaPrazo(super.getId(), super.getDescricao(), super.getValorTotal(),
					new Date(super.getData().getYear(), mes+parcelasPagas, super.getData().getDay()),
					super.getCategoria(),
					super.isParcelado(), this.numeroDeParcelas, this.valorDasParcelas, this.parcelasPagas);				
			parcelasPagas++;
			return d1;
		}
	}

	@Override
	public String toString() {
		return "DespesaPrazo {numeroDeParcelas = " + numeroDeParcelas + ", valorDasParcelas = " + valorDasParcelas
				+ ", parcelasPagas = " + parcelasPagas + ", " + super.toString() + "}";
	}


	


	
	

}

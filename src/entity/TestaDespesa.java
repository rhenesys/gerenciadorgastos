package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestaDespesa {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria(1, "alimentação", "ALIM");
		Despesa despesa;
		boolean isParcelado = true;
		
		Despesa d1 = new Despesa(1, "Restaurante Flamingo", 15.00, new Date(2018, 8, 15), true, categoria1);
		/*Despesa d2 = new Despesa(2, "Casa do pão de queijo", 20.00, new Date(2018, 9, 15), false,categoria1);
		Despesa d3 = new Despesa(3, "Despesa 3, mes 10", 40.00, new Date(2018, 10, 15), false,categoria1);
		Despesa d4 = new Despesa(4, "Despesa 4, mes 11", 50.00, new Date(2018, 11, 15), true,categoria1);
		Despesa d5 = new Despesa(5, "Despesa 5, mes 12", 60.00, new Date(2018, 12, 15), true,categoria1);		
		Despesa d1cc= new DespesaCartao(d1, 3);*/
		
		int cont=0;
		ListaDespesas l = new ListaDespesas();
		while(cont < 3) {
			if(isParcelado) {
				despesa = new DespesaCartao(d1, 3);
				cont++;
				isParcelado = false;
				System.out.println(l.getListaDespesa());
				System.out.println(l.toString());
			}else {
				despesa = new Despesa(2, "Casa do pão de queijo", 20.00, new Date(2018, 9, 15), false, categoria1);
				cont++;
				System.out.println(l.getListaDespesa());
			}			
		}

		/*List<DespesaCartao> dlist = new ArrayList<DespesaCartao>();
		DespesaCartao dcc = new DespesaCartao(1, "Restaurante Flamingo", 15.00, new Date(2018, 10, 15));
		dcc.setParcelado(true);
		dcc.setNumeroDeParcelas(3);
		dcc.valorParcelado();
		dlist.add(dcc);
		dcc.valoresParcelados();*/
		
		

	}

}

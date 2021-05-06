package model;

import java.util.HashSet;
import java.util.Set;

public class Funcionario{

	private Pedido pedido;
	
	public Funcionario() {
		pedido = new Pedido();
	}
	
	public void buildSanduiche(String sanduiche) {
		pedido.setDentroDaCaixa(sanduiche);
	}

	public void buildBatata(String batata) {
		pedido.setDentroDaCaixa(batata);
	}

	public void buildBrinquedo(String brinquedo) {
		pedido.setDentroDaCaixa(brinquedo);
	}

	public void buildRefrigerante(String refrigerante) {
		pedido.setForaDaCaixa(refrigerante);
	}
	
	public Pedido getPedido() {
		return pedido;
	}

}

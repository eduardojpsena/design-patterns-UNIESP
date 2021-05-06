package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {

	private List<String> dentroDaCaixa = new ArrayList<String>();
    private List<String> foraDaCaixa = new ArrayList<String>();
		
    
	public Pedido() {
	}

	
	public List<String> getDentroDaCaixa() {
		return dentroDaCaixa;
	}

	public void setDentroDaCaixa(String dentroDaCaixa) {
		this.dentroDaCaixa.add(dentroDaCaixa);
	}

	public List<String> getForaDaCaixa() {
		return foraDaCaixa;
	}

	public void setForaDaCaixa(String foraDaCaixa) {
		this.foraDaCaixa.add(foraDaCaixa);
	}

	
}

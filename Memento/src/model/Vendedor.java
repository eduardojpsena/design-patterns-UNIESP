package model;

public class Vendedor {
	
	private String nome;
	private float totalVendas;
	
	public Vendedor(String nome, float totalVendas) {
		this.nome = nome;
		this.totalVendas = totalVendas;
	}

	
	//Metodos para criação do Memento
	public Memento createMemento() {
		Memento memento = new Memento(nome, totalVendas);
		return memento;
	}
	
	public void restoreMemento(Memento memento) {
		this.nome = memento.getNome();
		this.totalVendas = memento.getTotalVendas();
	}
	
	
	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
}	

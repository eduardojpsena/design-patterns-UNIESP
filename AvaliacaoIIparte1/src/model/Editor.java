package model;

public class Editor {
	
	private String tipo;
	private ArquivoDiretor diretor = new ArquivoDiretor(new ArquivoBuilder());
	
	public Editor() {};

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public ArquivoDiretor getDiretor() {
		return diretor;
	}

	public void setDiretor(ArquivoDiretor diretor) {
		this.diretor = diretor;
	}
	
}

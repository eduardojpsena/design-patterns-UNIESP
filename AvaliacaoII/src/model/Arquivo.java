package model;

public final class Arquivo {
	
	//Atributos
	private String nome;
	private String caminho;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private String autImpressao;
	private String autCopia;
	
	//Singleton
	private static Arquivo instance;
	
	private Arquivo() {
	}
	
	public static Arquivo getInstance() {
		if (instance == null) 
			instance = new Arquivo();
		
 		return instance;
	}
	
	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String isAutImpressao() {
		return autImpressao;
	}
	public void setAutImpressao(String autImpressao) {
		this.autImpressao = autImpressao;
	}

	public String isAutCopia() {
		return autCopia;
	}
	public void setAutCopia(String autCopia) {
		this.autCopia = autCopia;
	}
	
}

package model;

public class ArquivoBuilder {
	
	private Arquivo arquivo;
	
	public ArquivoBuilder() {
		this.arquivo = Arquivo.getInstance();
	}
	
	public void buildNome(String nome) {
		this.arquivo.setNome(nome);
	}
	
	public void buildCaminho(String caminho) {
		this.arquivo.setCaminho(caminho);
	}
	
	public void buildData(String data) {
		this.arquivo.setData(data);
	}
	
	public void buildHora(String hora) {
		this.arquivo.setHora(hora);
	}
	
	public void buildProprietario(String proprietario) {
		this.arquivo.setProprietario(proprietario);
	}
	
	public void buildEmail(String email) {
		this.arquivo.setEmail(email);
	}
	
	public void buildImpressao(String autIm) {
		this.arquivo.setAutImpressao(autIm);
	}
	
	public void buildCopia(String autCp) {
		this.arquivo.setAutCopia(autCp);
	}
	
	public Arquivo getArquivo() {
		
		return arquivo;
	}
}

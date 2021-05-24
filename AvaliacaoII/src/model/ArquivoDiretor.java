package model;


public class ArquivoDiretor {
	
	private ArquivoBuilder builder;
		
	public ArquivoDiretor(ArquivoBuilder builder) {
		this.builder = builder;
	}
		
	public void buildArquivo(String nome, String caminho, String data, String hora, String proprietario, String email, String autIm, String autCp) {
		builder.buildNome(nome);
		builder.buildCaminho(caminho);
		builder.buildData(data);
		builder.buildHora(hora);
		builder.buildProprietario(proprietario);
		builder.buildEmail(email);
		builder.buildImpressao(autIm);
		builder.buildCopia(autCp);
	}
	
	public Arquivo getArquivo() {
		return builder.getArquivo();
	}
}

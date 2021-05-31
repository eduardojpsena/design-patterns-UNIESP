package model;

public class EditorFactory {
	
	public EditorFactory() {
		 
	}
	
	public Editor getEditor(String tipo, String nome, String caminho, 
								String data, String hora, String proprietario, 
									String email, String autIm, String autCp) {
		
		if (tipo.equals("T")) {
			
			return new Texto(nome, caminho, data, hora, proprietario, email, autIm, autCp);
			
		} else if (tipo.equals("A")) {

			return new Apresentacao(nome, caminho, data, hora, proprietario, email, autIm, autCp);
			
		} else if (tipo.equals("P")) {

			return new Planilha(nome, caminho, data, hora, proprietario, email, autIm, autCp);
			
		} else {
			return null;
		}
		 
	}
}

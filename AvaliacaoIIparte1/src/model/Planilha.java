package model;

public class Planilha extends Editor{
	
	public Planilha(String nome, String caminho, 
						String data, String hora, String proprietario, 
							String email, String autIm, String autCp) {
		
		editArq(nome, caminho, data, hora, proprietario, email, autIm, autCp);
		
	};

	public Arquivo editArq(String nome, String caminho, 
							String data, String hora, String proprietario, 
								String email, String autIm, String autCp) {

		getDiretor().buildArquivo(nome, caminho, data, hora, proprietario, email, autIm, autCp);
		
		Arquivo arquivo = getDiretor().getArquivo();
		
		System.out.println("Arquivo de planilha ''" + arquivo.getNome() + "'' criado com sucesso");
		
		if (autCp.equals("S")) {
			
			Arquivo arquivoCopy = getDiretor().getArquivo();
			arquivoCopy.setNome(nome+"Copy");
			System.out.println("Arquivo de Planilha ''" + arquivo.getNome() + "'' criado com sucesso");
					
		}
		
		return arquivo;
	}
}

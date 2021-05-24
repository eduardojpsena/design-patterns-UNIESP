package view;

import java.util.Scanner;

import model.Arquivo;
import model.ArquivoBuilder;
import model.ArquivoDiretor;
import model.Editor;
import model.EditorFactory;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String tipo = menu();
		
		System.out.println("\n������������ ARQUIVO ������������");
		
		String nome = validarNome();
		String caminho = validarCaminho();
		String data = "23/05/2021";
		String hora = "22:00";
		System.out.print("Seu nome: ");
		String proprietario = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Autoriza��o para impress�o? [Sim/N�o]:  ");
		String autIm = sc.nextLine().strip().toUpperCase().substring(0, 1);
		System.out.print("Autoriza��o para copiar? [Sim/N�o]:  ");
		String autCp = sc.nextLine().strip().toUpperCase().substring(0, 1);
		
		System.out.println("���������������������������������");
		
		EditorFactory ef = new EditorFactory();
		Editor editor = ef.getEditor(tipo, nome, caminho, data, hora, proprietario, email, autIm, autCp);
		
		sc.close();
		
		
		//Testes do singleton
		System.out.println();
		Editor editor1 = ef.getEditor("T", "Texto1", "C://", "15/02/2021", "15:00", "Eduardo", "eduardo@email.com", "N", "S");
		System.out.println();
		Editor editor2 = ef.getEditor("A", "Apresentacao1", "C://", "15/02/2021", "15:00", "Eduardo", "eduardo@email.com", "N", "N");
		System.out.println();
		Editor editor3 = ef.getEditor("P", "Texto1", "C://", "15/02/2021", "15:00", "Eduardo", "eduardo@email.com", "S", "N");
		
		System.out.println("\n\n==========================================");
		System.out.println("Garantindo as instancias unicas do singleton");
		System.out.println(editor.getDiretor().getArquivo());
		System.out.println(editor1.getDiretor().getArquivo());
		System.out.println(editor2.getDiretor().getArquivo());
		System.out.println(editor3.getDiretor().getArquivo());
	}
	
	public static String validarNome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome*: ");
		String nome = sc.nextLine();
		while (true) {
			
			if (nome.equals("")) {
				System.out.println("Nome do arquivo � obrigat�rio");
				System.out.print("Nome*: ");
				nome = sc.nextLine();
			} else {
				break;
			}
			
		}
		return nome;
	}
	
	public static String validarCaminho() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Caminho*: ");
		String caminho = sc.nextLine();
		while (true) {
			
			if (caminho.equals("")) {
				System.out.println("Caminho do arquivo � obrigat�rio");
				System.out.print("Caminho*: ");
				caminho = sc.nextLine();
			} else {
				break;
			}
			
		}
		return caminho;
	}
	
	public static String menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual aplicativo deseja execultar \n"
				+ "   T - [Texto]\n"
				+ "   A - [Apresenta��o]\n"
				+ "   P - [Planilha]\n"
				+ "Digite sua op��o: ");
		String tipo = sc.nextLine().strip().toUpperCase();
		
		while (true) {
			if (tipo.equals("A") || tipo.equals("T") || tipo.equals("P")) {
				break;
			} else {
				System.out.println("\nAplica��o incorreta, tente novamente.\n");
				System.out.print("Qual aplicativo deseja execultar \n"
						+ "   T - [Texto]\n"
						+ "   A - [Apresenta��o]\n"
						+ "   P - [Planilha]\n"
						+ "Digite sua op��o: ");
				tipo = sc.nextLine().strip().toUpperCase();
			}
		}
		return tipo;
	}

}

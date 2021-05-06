package view;

import java.util.Scanner;

import model.Atendente;
import model.Funcionario;
import model.Pedido;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Atendente atendente = new Atendente(new Funcionario());
		
		System.out.println("•Faça seu pedido•");
		System.out.print("Escolha o sanduiche [Hamburguer/Xburguer]: ");
		String sanduiche = sc.nextLine();
		System.out.print("Escolha o tamanho da batata [Pequena/Media/Grande]: ");
		String batata = sc.nextLine();
		System.out.print("Escolha o brinquedo [Carrinho/Bonequinha]: ");
		String brinquedo = sc.nextLine();
		System.out.print("Escolha o refrigerante [Coca-Cola/Guaraná]: ");
		String refrigerante = sc.nextLine();
		
		
		atendente.montarPedido(sanduiche, batata, brinquedo, refrigerante);
		
		Pedido pedido = atendente.getPedido();
		System.out.println("-----------------------------------------------");
		System.out.println("Itens dentro da caixa: " + pedido.getDentroDaCaixa());
		System.out.println("Itens fora da caixa: " + pedido.getForaDaCaixa());
		
	}
}

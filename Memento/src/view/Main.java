package view;

import model.VendasMemory;
import model.Vendedor;

public class Main {

	public static void main(String[] args) {

		//Cria objeto vendedor
		Vendedor vendedor = new Vendedor("Eduardo", 1000.0F);
		
		System.out.println("• Objeto Criado •");
		System.out.println(vendedor.getNome() + "- Total de vendas: " + vendedor.getTotalVendas() + "\n");
		
		//Salva o estado do objeto
		VendasMemory memory = new VendasMemory();
		memory.setMemento(vendedor.createMemento());
		
		//Altera os valores dos atributos do objeto vendedor
		vendedor.setNome("Andre");
		vendedor.setTotalVendas(500.0F);
		
		System.out.println("• Objeto Alterado •");
		System.out.println(vendedor.getNome() + "- Total de vendas: " + vendedor.getTotalVendas() + "\n");
		
		//Restaura o objeto ao estado salvo pelo memento
		vendedor.restoreMemento(memory.getMemento());
		
		System.out.println("• Objeto retornando ao estado salvo pelo Memento •");
		System.out.println(vendedor.getNome() + "- Total de vendas: " + vendedor.getTotalVendas() + "\n");
	}

}

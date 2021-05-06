package model;

public class Atendente {
	
	private Funcionario funcionario;
	
	public Atendente(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void montarPedido(String sand, String bat, String brinq, String refri) {
		funcionario.buildSanduiche(sand);
		funcionario.buildBatata(bat);
		funcionario.buildBrinquedo(brinq);
		funcionario.buildRefrigerante(refri);
	}
	
	public Pedido getPedido() {
		return funcionario.getPedido();
	}
}

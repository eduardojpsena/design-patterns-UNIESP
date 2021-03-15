
public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Eduardo");
		Fita morteBezerra = new Fita("A morte da bezerra", Tipo.lancamento);
		Fita cadeiraMaluca = new Fita("A cadeira maluca", Tipo.normal);
		Fita pepaPig = new Fita("Pepa pig eletrico", Tipo.infantil);
		
		Aluguel aluguel = new Aluguel();
		aluguel.adicionaAluguel(c1, 3, morteBezerra);
		aluguel.adicionaAluguel(c1, 3, cadeiraMaluca);
		aluguel.adicionaAluguel(c1, 3, pepaPig);
		
		System.out.println(aluguel.getFitasAlugadas());
		
		System.out.println(aluguel.extrato());
		
	}

}

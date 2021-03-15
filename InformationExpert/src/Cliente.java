
public class Cliente {
    //Atributos
	private String nome;

    //private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
	
	//Construtores
    public Cliente(String nome) {
        this.nome = nome;    }
    
    //Get e Set
	public String getNome() {
        return nome;
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//toString
	public String toString() {
		return "Cliente: nome = " + nome;
	}
}
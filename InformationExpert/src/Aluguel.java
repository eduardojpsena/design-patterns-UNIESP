import java.util.ArrayList;
import java.util.Collection;

public class Aluguel {
	//Atributos
	private Fita fita;
    private int diasAlugada;
    private Cliente cliente;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
    
    //Construtor
    public Aluguel () {}
    
    public Aluguel(Cliente cliente, int diasAlugada, Fita fita) {
    	this.fita = fita;
        this.cliente = cliente;
        this.diasAlugada = diasAlugada;
    }

  //Metodos
  	public void adicionaAluguel(Cliente cliente, int diasAlugada, Fita fita) {
  		Aluguel aluguel = new Aluguel(cliente, diasAlugada, fita);
  		fitasAlugadas.add(aluguel);
    }
  	
  //Metodos
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String nomeCliente = null;
        for (Aluguel aluguel : fitasAlugadas) {
			nomeCliente = aluguel.cliente.getNome();
		}
        String resultado = "Registro de Alugueis de " + nomeCliente + fimDeLinha;
        
        for (Aluguel aluguel : fitasAlugadas) {
        	double valorCorrente = 0.0;
        	
        	// determina valores para cada linha
            // switch com enum
        	switch (aluguel.getFita().getCodigoDePreco()) {
			case normal:
				valorCorrente += 2;
				if (aluguel.getDiasAlugada() > 2) {
					valorCorrente += (aluguel.getDiasAlugada() - 2) * 1.5;
				}
				break;
			case lancamento:
				valorCorrente += aluguel.getDiasAlugada() * 3;
				break;
			case infantil:
				valorCorrente += 1.5;
                if (aluguel.getDiasAlugada() > 3) {
                    valorCorrente += (aluguel.getDiasAlugada() - 3) * 1.5;
                }
                break;
			}
        	// trata de pontos de alugador frequente
        	pontosDeAlugadorFrequente++;
        	// adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
        	if (aluguel.getFita().getCodigoDePreco() == Tipo.lancamento
                    && aluguel.getDiasAlugada() > 1) {
                    pontosDeAlugadorFrequente++;
        	}
        	// mostra valores para este aluguel
        	resultado += "\t" + aluguel.getFita().getTitulo() + "\t"
                    	+ valorCorrente + fimDeLinha;
        	valorTotal += valorCorrente;
        }
     // adiciona rodapé
        resultado += "Valor total devido: \t\t" + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
	}
        
  	
    //Get e Set
    public Fita getFita() {
		return fita;
	}
	public void setFita(Fita fita) {
		this.fita = fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}
	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<Aluguel> getFitasAlugadas() {
		return fitasAlugadas;
	}
	public void setFitasAlugadas(Collection<Aluguel> fitasAlugadas) {
		this.fitasAlugadas = fitasAlugadas;
	}
	
	//toString
	public String toString() {
		return "Aluguel: "+ cliente + ", " + fita + ", dias alugados: " + diasAlugada + " / ";
	}
}

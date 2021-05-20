package controller;

import model.Adaptador;
import model.SomadorAlvo;

public class Cliente {
	SomadorAlvo somador = new Adaptador();
	
	public Cliente(SomadorAlvo somador) {
		this.somador = somador;
	}
	
	public void executa() {
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado " + soma);
	}
}

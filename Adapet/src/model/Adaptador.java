package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adaptador extends SomadorExistente implements SomadorAlvo{
	
	public Adaptador() {};
	
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i : vetor) {
			lista.add(i);
		}
		
		
		return somaLista(lista);
	}

}

package view;

import java.util.ArrayList;
import java.util.List;

import controller.Cliente;
import model.Adaptador;
import model.SomadorAlvo;

public class Main {

	public static void main(String[] args) {
		
		SomadorAlvo somador = new Adaptador();
		
		Cliente cliente = new Cliente(somador);
		
		cliente.executa();
		
	}

}

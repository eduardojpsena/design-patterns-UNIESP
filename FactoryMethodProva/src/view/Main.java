package view;

import java.util.Scanner;

import model.ApresentationFactory;
import model.Name;

public class Main {

	public static void main(String[] args) {
				
		String name1 = "Eduardo Sena";
		String name2 = "Eduardo José Pereira de Sena";
		String name3 = "Sena, Eduardo";
		
		ApresentationFactory af = new ApresentationFactory();
		
		Name nm1 = af.getName(name1);
		Name nm2 = af.getName(name2);
		Name nm3 = af.getName(name3);
		
		
		System.out.println(nm1.apresentation());
		System.out.println(nm2.apresentation());
		System.out.println(nm3.apresentation());
	}

}

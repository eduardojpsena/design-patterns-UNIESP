package view;

import java.util.Scanner;

import model.FactoryShop;
import model.Gender;

public class Main {

	public static void main(String[] args) {
		String type, name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		name = sc.nextLine();
		
		System.out.print("Digite seu gênero [Masculiono/Feminino/Indefinido]: ");
		type = sc.nextLine().strip().toLowerCase().substring(0, 1);
		
		FactoryShop fs = new FactoryShop();
		Gender gender = fs.getGender(name, type);
		System.out.println(gender.salutation(type));
		
		sc.close();
	}

}

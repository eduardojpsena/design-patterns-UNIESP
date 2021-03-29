package model;

public class Female extends Gender{

	public Female(String name, String typeGender) {
		super(name, typeGender);
	}
	
	public String salutation(String type) {
		return "Bem-vindo, Sra. " + getName() + "!";
		
	}
}

package model;

public class Male extends Gender{
	
	public Male(String name, String typeGender) {
		super(name, typeGender);
	}
	
	public String salutation(String type) {
		return "Bem-vindo, Sr. " + getName() + "!";
		
	}
}

package model;

public class CommaName extends Name{

	public CommaName(String firstName, String surname) {
		super(firstName, surname);
	}
	
	public String apresentation() {
		return getFirstName() + " " + getSurname();
	}
}

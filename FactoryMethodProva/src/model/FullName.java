package model;

public class FullName extends Name{

	public FullName(String firstName, String surname) {
		super(firstName, surname);
	}
	
	public String apresentation() {
		return getFirstName() + " " + getSurname();
	}
}

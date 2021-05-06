package model;

public class DoubleName extends Name{

	public DoubleName(String firstName, String surname) {
		super(firstName, surname);
	}

	public String apresentation() {
		return getFirstName() + " " + getSurname();
	}
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Name {
	
	private String firstName;
	private String surname;
	
	public Name() {}
	
	
	public Name(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String apresentation() {
		return firstName + " " + surname;
	}
	
}

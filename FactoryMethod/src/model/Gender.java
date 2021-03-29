package model;

public class Gender {
	
	private String name;
	private String type;
	
	public Gender() {}
	
	public Gender(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String salutation(String type) {
		return "Bem-vindo(a) " + this.name + "!";
	}
}

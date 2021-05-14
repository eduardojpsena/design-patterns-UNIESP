package model;

public abstract class Shape {
	
	private String id;
	protected String type;
	
	public Shape () {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public abstract Shape clone();
	
	public abstract String exibirInfo();
}

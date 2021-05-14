package model;

public class Circle extends Shape{
	
	public Circle (Circle circle) {
		this.type = circle.getType();
	}
	
	public Circle() {
		this.type = "Circle simple";
	}
	
	public Shape clone() {
		return new Circle(this);
	}

	public String exibirInfo() {
		return "Type: " + getType();
	}
		
}

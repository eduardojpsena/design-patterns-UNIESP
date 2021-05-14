package model;

public class Rectangle extends Shape{
	
	public Rectangle(Rectangle rectangle) {
		this.type = rectangle.getType();
	}
	
	public Rectangle() {
		this.type = "Rectangle simple";
	}
	
	public Shape clone() {
		return new Rectangle(this);
	}
	
	public String exibirInfo() {
		return "Type: " + getType();
	}
	
}

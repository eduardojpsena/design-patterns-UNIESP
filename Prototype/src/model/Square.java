package model;

public class Square extends Shape{
	
	public Square(Square square) {
		this.type = square.getType();
	}
	
	public Square() {
		this.type = "Square simple";
	}
	
	public Shape clone() {
		return new Square(this);
	}
	
	public String exibirInfo() {
		return "Type: " + getType();
	}
	
}

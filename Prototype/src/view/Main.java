package view;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		System.out.println(circle.exibirInfo() + "\n" 
							+ rectangle.exibirInfo() + "\n" 
							+ square.exibirInfo());
		
		System.out.println("------------------");
		
		Shape circleRed = circle.clone();
		circleRed.setType("Circulo Vermelho");
		System.out.println(circleRed.exibirInfo());
				
		Shape rectangleYellow = rectangle.clone();
		rectangleYellow.setType("Rectangle Yellow");
		System.out.println(rectangleYellow.exibirInfo());
		
		Shape squareBlue = square.clone();
		squareBlue.setType("Square Blue");
		System.out.println(squareBlue.exibirInfo());
		
		
	}

}

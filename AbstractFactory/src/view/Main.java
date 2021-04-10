package view;

import java.util.Scanner;

import model.EnchantedMazeFactory;
import model.Maze;
import model.MazeFactory;
import model.NormalMazeFactory;

public class Main {
	
	private static Maze buildMaze(String mazeType) {
		MazeFactory mf = null;
		if (mazeType.equals("normal")) {
			mf = new NormalMazeFactory();
		}
		
		else if (mazeType.equals("enchanted")) {
			mf = new EnchantedMazeFactory();
		}
		
		Maze maze = mf.getMaze();
				
		return maze;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the type of maze you want to create [Normal / Enchanted]: ");
		String type = sc.nextLine().toLowerCase();
		System.out.println("---------------------------------");
		Maze maze = buildMaze(type);
		System.out.println("---------------------------------");
		System.out.println("Maze Type " + type.toUpperCase() + " Built");
		
	}

}

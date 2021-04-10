package model;

public class EnchantedMazeFactory extends MazeFactory{

	public EnchantedMazeFactory() {};
	
//	public Room buildRoom() {
//		return new EnchantedRoom();
//	}
//
//	public Wall buildWall() {
//		return new EnchantedWall();	
//	}
//
//	public Door buildDoor() {
//		return new EnchantedDoor();	
//	}

	public Maze getMaze() {
		return new Maze(new EnchantedRoom(), new EnchantedWall(), new EnchantedDoor());
	}

}

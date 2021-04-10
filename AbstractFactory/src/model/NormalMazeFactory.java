package model;

public class NormalMazeFactory extends MazeFactory{

	public NormalMazeFactory() {};
	
//	public Room buildRoom() {
//		Room room = new NormalRoom();
//		return room;
//	}
//
//	public Wall buildWall() {
//		Wall wall = new NormalWall();
//		return wall;
//	}
//
//	public Door buildDoor() {
//		Door door = new NormalDoor();
//		return door;
//	}

	public Maze getMaze() {
		return new Maze(new NormalRoom(), new NormalWall(), new NormalDoor());
	}
	
}

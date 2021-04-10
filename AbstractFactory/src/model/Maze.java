package model;

public class Maze {
	
	private Room room;
	private Wall wall;
	private Door door;
	
	public Maze() {}
	
	public Maze(Room room, Wall wall, Door door) {
		this.room = room;
		this.wall = wall;
		this.door = door;
	}


	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}

	public Wall getWall() {
		return wall;
	}
	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}

	public String toString() {
		return "Maze [room=" + room + ", wall=" + wall + ", door=" + door + "]";
	}
	
}

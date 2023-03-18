package _04_Snake;

public class Location {

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private int x;
	private int y;
	
	public boolean equals(Location l, int x, int y) {
		if(this.x == x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}


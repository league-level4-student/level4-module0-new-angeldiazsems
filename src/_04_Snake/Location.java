package _04_Snake;

public class Location {

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
}

package assignment4;

public class Ship {
	String name;
	int yearBuilt;
	
	public Ship(String name, int yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	
	public String toString() {
		return "SHIP\nShip Name: " + name + "\nBuilt: " + yearBuilt + "\n";
	}
}

package assignment4;

public class ShipDriver {
	public static void main(String[] args) {
		Ship[] ships = new Ship[4];
		ships[0] = new Ship("Heron", 1994);
		ships[1] = new Ship("Wolfwind", 1976);
		ships[2] = new CruiseShip("Explorer", 2003, "Bahamas", 120, 45, 4, 6);
		ships[3] = new CargoShip("Karaboudjan", 2014, "Bulk Carrier", 1340, 150000);
		
		for (int i = 0; i < ships.length; i++) {
			System.out.println(ships[i]);
		}
	}
}

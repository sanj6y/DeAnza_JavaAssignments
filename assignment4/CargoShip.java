package assignment4;

import java.text.DecimalFormat;

public class CargoShip extends Ship {
	String shipType;
	int length;
	int maxCapacity;
	
	CargoShip(String name, int yearBuilt, String shipType, 
			int length, int maxCapacity) {
		super(name, yearBuilt);
		this.shipType = shipType;
		this.length = length;
		this.maxCapacity = maxCapacity;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		StringBuilder sb = new StringBuilder();
		sb.append("CARGO SHIP\nShip Name: ");
		sb.append(name);
		sb.append("\nBuilt: ");
		sb.append(yearBuilt);
		sb.append("\nType of Cargo Ship: ");
		sb.append(shipType);
		sb.append("\nOverall Length (ft): ");
		sb.append(df.format(length));
		sb.append("\nGross Tonnage: ");
		sb.append(df.format(maxCapacity));
		sb.append("\n");
		
		return sb.toString();
	}
}

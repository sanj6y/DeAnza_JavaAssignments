package assignment4;

public class CruiseShip extends Ship {
	String destination;
	int passengerAmount;
	int cabins;
	int swimmingPools;
	int restaurants;
	
	public CruiseShip(String name, int yearBuilt, String destination,
			int passengerAmount, int cabins, int swimmingPools, int restaurants) {
		super(name, yearBuilt);
		this.destination = destination;
		this.passengerAmount = passengerAmount;
		this.cabins = cabins;
		this.swimmingPools = swimmingPools;
		this.restaurants = restaurants;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("CRUISE SHIP\nShip Name: ");
		builder.append(name);
		builder.append("\nBuilt: ");
		builder.append(yearBuilt);
		builder.append("\nDestination: ");
		builder.append(destination);
		builder.append("\nPassengers: ");
		builder.append(passengerAmount);
		builder.append("\nNumber of Cabins: ");
		builder.append(cabins);
		builder.append("\nNumber of Swimming Pools: ");
		builder.append(swimmingPools);
		builder.append("\nNumber of Restaurants: ");
		builder.append(restaurants);
		builder.append("\n");
		
		return builder.toString();
	}
}

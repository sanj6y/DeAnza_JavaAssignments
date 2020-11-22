package assignment3;

public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}
	
	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
	//print sales data for all 6 stores
	public void printSalesDetails() {
		for (int i = 0; i < numberofstores(); i++) {
			System.out.println("");
			System.out.println("Sales Details for Store " + (i+1));
			Store store = getStores(i);
			store.printSalesDetails();
		}
	}
	
}

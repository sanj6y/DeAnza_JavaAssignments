package assignment3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("/Users/sanjaychandrasekar/eclipse-workspace/Assignments/src/assignment3/Salesdat.txt");
		Franchise f = a1.readData();
		f.printSalesDetails();
	}
}

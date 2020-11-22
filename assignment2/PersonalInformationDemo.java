package assignment2;

import java.util.Scanner;

public class PersonalInformationDemo {
	
	public static PersonalInformation getPersonDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name: ");
		String name = sc.nextLine();
		System.out.println("Please enter an address: ");
		String address = sc.nextLine();
		System.out.println("Please enter an age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter a phone number: ");
		String phoneNumber = sc.nextLine();
		sc.close();
		
		
		PersonalInformation person = new PersonalInformation(name, 
				address, age, phoneNumber);
		
		return person;
	}
	
	public static void main(String[] args) {
		
		PersonalInformation person1 = getPersonDetails();
		PersonalInformation person2 = getPersonDetails();
		PersonalInformation person3 = getPersonDetails();
		
	}
	
}

package assignment2;

public class PersonalInformation {
	
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalInformation(String name, String address, 
			int age, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nameGiven) {
		name = nameGiven;
	}
	
	public String getAddress() {
		return address;	
	}
	
	public void setAddress(String addressGiven) {
		address = addressGiven;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int ageGiven) {
		age = ageGiven;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumberGiven) {
		phoneNumber = phoneNumberGiven;
	}

}

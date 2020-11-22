package assignment4;

public class TestSavingsAccount {
	public static void main(String[] args) {
		
		//PART1
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		System.out.println("Initial savings balance for Saver 1: " + saver1.getSavingsBalance());
		System.out.println("Initial savings balance for Saver 2: " + saver2.getSavingsBalance());
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Month 1 savings balance for Saver 1: " + saver1.getSavingsBalance());
		System.out.println("Month 1 savings balance for Saver 2: " + saver2.getSavingsBalance());
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Month 2 savings balance for Saver 1: " + saver1.getSavingsBalance());
		System.out.println("Month 2 savings balance for Saver 2: " + saver2.getSavingsBalance());
		
		
	}
}

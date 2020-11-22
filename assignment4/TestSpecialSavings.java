package assignment4;

public class TestSpecialSavings {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SpecialSavings();
		SavingsAccount saver2 = new SpecialSavings();
		
		saver1.setSavingsBalance(2000);
		double monthlyInterest1 = saver1.getMonthlyInterest();
		saver1.calculateMonthlyInterest();
		System.out.println("Balance for Saver 1 after Month 1: " + saver1.getSavingsBalance());
		System.out.println("Interest earned for Saver 1 after Month 1: " + monthlyInterest1);
		System.out.println();
		
		saver1.deposit(3000);
		monthlyInterest1 = saver1.getMonthlyInterest();
		saver1.calculateMonthlyInterest();
		System.out.println("Balance for Saver 1 after Month 2: " + saver1.getSavingsBalance());
		System.out.println("Interest earned for Saver 1 after Month 2: " + monthlyInterest1);
		System.out.println();
		
		saver1.withdraw(1500);
		monthlyInterest1 = saver1.getMonthlyInterest();
		saver1.calculateMonthlyInterest();
		System.out.println("Balance for Saver 1 after Month 3: " + saver1.getSavingsBalance());
		System.out.println("Interest earned for Saver 1 after Month 3: " + monthlyInterest1);
		System.out.println();
		
		saver1.deposit(7500);
		monthlyInterest1 = saver1.getMonthlyInterest();
		saver1.calculateMonthlyInterest();
		System.out.println("Balance for Saver 1 after Month 4: " + saver1.getSavingsBalance());
		System.out.println("Interest earned for Saver 1 after Month 4: " + monthlyInterest1);
		System.out.println();
		
		saver1.withdraw(3750);
		monthlyInterest1 = saver1.getMonthlyInterest();
		saver1.calculateMonthlyInterest();
		System.out.println("Balance for Saver 1 after Month 5: " + saver1.getSavingsBalance());
		System.out.println("Interest earned for Saver 1 after Month 5: " + monthlyInterest1);
		System.out.println();

		saver2.setSavingsBalance(3000);
		double monthlyInterest2 = saver2.getMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Balance for Saver 2 after Month 1: " + saver2.getSavingsBalance());
		System.out.println("Interest earned for Saver 2 after Month 1: " + monthlyInterest2);
		System.out.println();

		saver2.deposit(8000);
		monthlyInterest2 = saver2.getMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Balance for Saver 2 after Month 2: " + saver2.getSavingsBalance());
		System.out.println("Interest earned for Saver 2 after Month 2: " + monthlyInterest2);
		System.out.println();

		saver2.withdraw(500);
		monthlyInterest2 = saver2.getMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Balance for Saver 2 after Month 3: " + saver2.getSavingsBalance());
		System.out.println("Interest earned for Saver 2 after Month 3: " + monthlyInterest2);
		System.out.println();
		
		saver2.withdraw(4000);
		monthlyInterest2 = saver2.getMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Balance for Saver 2 after Month 4: " + saver2.getSavingsBalance());
		System.out.println("Interest earned for Saver 2 after Month 4: " + monthlyInterest2);
		System.out.println();
		
		saver2.deposit(2300);
		monthlyInterest2 = saver2.getMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Balance for Saver 2 after Month 5: " + saver2.getSavingsBalance());
		System.out.println("Interest earned for Saver 2 after Month 5: " + monthlyInterest2);
	}
}

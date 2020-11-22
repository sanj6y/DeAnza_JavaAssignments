package assignment4;

public class SpecialSavings extends SavingsAccount{
	
	private static final double SPECIAL_IR_ABOVE_10K = 0.10;
	private static final double SPECIAL_IR_BELOW_10K = 0.04;

	public void calculateMonthlyInterest() {
		double savingsBalance = getSavingsBalance();
		double annualInterestRate = SPECIAL_IR_BELOW_10K;
		if (savingsBalance > 10000) {
			annualInterestRate = SPECIAL_IR_ABOVE_10K;
		}
		double monthlyInterest = savingsBalance * (annualInterestRate/12);
		savingsBalance += monthlyInterest;
		setSavingsBalance(savingsBalance);
	}
	
	public double getMonthlyInterest() {
		double savingsBalance = getSavingsBalance();
		double annualInterestRate = SPECIAL_IR_BELOW_10K;
		if (savingsBalance > 10000) {
			annualInterestRate = SPECIAL_IR_ABOVE_10K;
		}
		double monthlyInterest = savingsBalance * (annualInterestRate/12);
		return monthlyInterest;
	}
}

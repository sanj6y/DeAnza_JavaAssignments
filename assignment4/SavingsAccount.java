package assignment4;

public class SavingsAccount {
	
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount() {
		savingsBalance = 0;
	}
	
	public SavingsAccount(double balance) {
		savingsBalance = balance;
	}
	
	public void calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance * (annualInterestRate/12);
		savingsBalance += monthlyInterest;
	}
	
	protected double getSavingsBalance() {
		return savingsBalance;
	}
	
	protected void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	protected void deposit(double depAmount) {
		if (depAmount > 0) {
			savingsBalance += depAmount;
		}
	}
	
	protected void withdraw(double withAmount) {
		if (withAmount > 0) {
			savingsBalance -= withAmount;
		}
	}
	
	public double getMonthlyInterest() {
		double monthlyInterest = savingsBalance * (annualInterestRate/12);
		return monthlyInterest;
	}
	
	protected static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}

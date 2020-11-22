package assignment1;

//Import modules for user input and for rounding decimals
import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanAmortizationSchedule {
	
	public static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double loanAmount = 0.0;
		int numYears = 0;
		double annualInterestRate = 0.0;
		
		//Get user input for Loan Amount, # of Years, and Annual Interest Rate
		do {
			System.out.print("Loan Amount: ");
			loanAmount = sc.nextDouble();
			if (loanAmount <= 0) {
				System.out.println("Please enter a Loan Amount greater than 0.");
			}
		} while (loanAmount <= 0);
		
		do {
			System.out.print("Number of Years: ");
			numYears = sc.nextInt();
			if (numYears <= 0) {
				System.out.println("Please enter a value greater than 0.");
			}
		} while (numYears <= 0);
		
		do {
			System.out.print("Annual Interest Rate (in %): ");
			annualInterestRate = sc.nextDouble();
			if (annualInterestRate <= 0) {
				System.out.println("Please enter annual interest rate greater than 0.");
			}
		} while (annualInterestRate <= 0);
		
		System.out.println();
		sc.close();
		
		//Convert years to months and annual rate to monthly rate
		int totalMonths = numYears * 12;
		double monthlyRate = annualInterestRate/100/12;
		
		//Calculate Monthly payment using formula (given in instructions)
		double temp = Math.pow(1 + monthlyRate, totalMonths);
		double monthlyPayment = loanAmount * monthlyRate * temp / (temp - 1);
		
		//Call method to print Amortization Schedule
		printAmortizationSchedule(loanAmount, totalMonths, monthlyPayment, monthlyRate);
	}
	
	public static void printAmortizationSchedule(double loanAmount, int totalMonths, double monthlyPayment, double rate) {
		
		//Declare balance and total interest variables
		double balance = loanAmount;
		double totalInterest = 0.0;
		
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		
		//For loop that calculates all values for each month
		for (int month = 1; month <= totalMonths; month++) {
			double interest = balance * rate;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			totalInterest = totalInterest + interest;
			
			//If balance is non-zero for last month then last payment should be normal monthly payment + final balance. 
			if (month == totalMonths && balance != 0) {
				principal = principal + balance;
				balance = 0;
			}
			System.out.println(month + "\t\t" + df.format(interest)+ "\t\t" + df.format(principal) + "\t\t" + df.format(balance));
		}
		System.out.println("");
		System.out.println("Monthly payment: "+ df.format(monthlyPayment));
		System.out.println("Total payment: " + df.format(loanAmount + totalInterest));
	}	
}
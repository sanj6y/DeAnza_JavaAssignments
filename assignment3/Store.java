package assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
	private float salesbyweek[][];

	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setSaleForWeekDayIntersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	public void printData() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	// float [] getsalesforentireweek(int week)
	public float[] getSalesForEntireWeek(int week) {
		try {
			return salesbyweek[week-1];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: The week number can only be between 1 and 5.");
			e.printStackTrace();
			return null;
		}
	}
	
	// float getsaleforweekdayintersection(int week, int day)
	public float getSaleForWeekDayIntersection(int week, int day) {
		float saleAmount = 0;
		try {
			saleAmount = salesbyweek[week-1][day-1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: The week number can only be between 1 and 5, and the day number can only be between 1 and 7.");
			e.printStackTrace();
		}
		return saleAmount;
	}
	
	// businessmethod
	// a. totalsalesforweek
	public float getTotalSalesForWeek(int week) {
		float totalSales = 0;
		float[] weeklySales = getSalesForEntireWeek(week);
		for (int i = 0; i < weeklySales.length; i++) {
			totalSales = totalSales + weeklySales[i];
		}
		return totalSales;
	}
	
	// b. avgsalesforweek
	public float avgSalesForWeek(int week) {
		float totalSales = getTotalSalesForWeek(week);
		return (totalSales/7);
	}
	
	// c. totalsalesforallweeks
	public float totalSalesForAllWeeks() {
		float totalSales = 0;
		for (int i = 1; i < 5; i++) {
			totalSales = totalSales + this.getTotalSalesForWeek(i);
		}
		return totalSales;
	}
	
	// d. averageweeklysales
	public float averageWeeklySales() {
		float totalSalesForAllWeeks = totalSalesForAllWeeks();
		return (totalSalesForAllWeeks/salesbyweek.length);
	}
	
	// e. weekwithhighestsaleamt
	public int getWeekWithHighestSaleAmt() {
		float maxSales = 0;
		int week = 1;
		for (int i = 1; i < 5; i++) {
			float totalSalesForWeek = getTotalSalesForWeek(i);
			if (totalSalesForWeek > maxSales) {
				maxSales = totalSalesForWeek;
				week = i;
			}
		}
		return week;
	}
	
	// f. weekwithlowestsaleamt
	public int getWeekWithLowestSaleAmt() {
		float minSales = 0;
		int week = 1;
		for (int i = 1; i < 5; i++) {
			float totalSalesForWeek = getTotalSalesForWeek(i);
			if (totalSalesForWeek < minSales) {
				minSales = totalSalesForWeek;
				week = i;
			}
		}
		return week;
	}
	
	// analyzeresults //call a through f
	public void printSalesDetails() {
		for (int i = 1; i <= 5; i++ ) {
			System.out.println("Total Sales for Week " + i + ": " + this.getTotalSalesForWeek(i));
			System.out.println("Average Sales for Week " + i + ": " + this.avgSalesForWeek(i));
		}
		System.out.println("Total Sales for All Weeks: " + this.totalSalesForAllWeeks());
		System.out.println("Average Sales for All Weeks: " + this.averageWeeklySales());
		System.out.println("Week with Highest Sales: Week " + this.getWeekWithHighestSaleAmt());
		System.out.println("Week with Lowest Sales: Week " + this.getWeekWithLowestSaleAmt());
	}
}

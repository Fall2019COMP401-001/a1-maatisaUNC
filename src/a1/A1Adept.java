package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class A1Adept {
	
	public static ArrayList<String> food = new ArrayList<>();
	public static ArrayList<String> cost = new ArrayList<>();
	public static ArrayList<String> customerName = new ArrayList<>();
	public static ArrayList<String> customerCost = new ArrayList<>();
	public static ArrayList<String> tempCustomerInfo = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// An integer indicating the total number of items
		int total_Items = scan.nextInt();
		
		// Cycles through each item 
		for (int i = 0; i < total_Items; i++) {
			String nameOfItem = scan.next();
			double theCostOfItem = scan.nextDouble();
			// Adds the item to a array list to be called later
			food.add(nameOfItem);
			cost.add(String.valueOf(theCostOfItem));
		}
		double[] theCosts = new double[cost.size()];
		// Copies array list of costs into fixed size array
		for (int i = 0; i < cost.size(); i++) {
			theCosts[i] = Double.valueOf(cost.get(i));
		}
		
		// An integer indicating the number of customers
		int total_Customers = scan.nextInt();
		for (int i = 0; i < total_Customers; i++) {
			// Gets the first and last name
			String firstName = scan.next();
			String lastName  = scan.next();
			// Gets the number of items that customer has
			int items = scan.nextInt();
			double theFinalCost = 0;
			// Loops through the number of items
			for (int j = 0; j < items; j++) {
				int howMany = scan.nextInt();
				String theFood = scan.next();
				// Gets the total cost for that customer
				for (int k = 0; k < food.size(); k++) {
					if (theFood.contentEquals(food.get(k))) {
						theFinalCost += howMany * theCosts[k];
					}
				}
			}
			// Adds name and total cost to array lists
			customerName.add(firstName + " " + lastName);
			customerCost.add(String.valueOf(theFinalCost));
		}
		// Copies cost into an array
		double[] thePrice = new double[customerCost.size()];
		for (int i = 0; i < thePrice.length; i++) {
			thePrice[i] = Double.valueOf(customerCost.get(i));
		}
		// Finds the biggest element in array and smallest
		Arrays.sort(thePrice);
		double smallest = thePrice[0];
		double largest  = thePrice[customerCost.size() - 1];
		// Variables to hold the index
		int smallestHolder = 0;
		int largestHolder  = 0;
		// Finds the index of the largest and smallest values
		for (int i = 0; i < thePrice.length; i++) {
			if (smallest == Double.valueOf(customerCost.get(i))) {
				smallestHolder = i;
			}
			if (largest == Double.valueOf(customerCost.get(i))) {
				largestHolder = i;
			}
		}
		// Finds the average of the cost
		double average = 0;
		for (int i = 0; i < thePrice.length; i++) {
			average += thePrice[i];
		}
		average = average / thePrice.length;
		System.out.println("\nBiggest: " + customerName.get(largestHolder) + " (" + String.format(java.util.Locale.US,"%.2f", largest) + ")");
		System.out.println("Smallest: " + customerName.get(smallestHolder) + " (" + String.format(java.util.Locale.US,"%.2f", smallest) + ")");
		System.out.println("Average: " + String.format(java.util.Locale.US,"%.2f", average));
		
		// Closes scanner 
		scan.close();
		
	}
	
}





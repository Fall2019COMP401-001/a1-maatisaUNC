package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {
	
	public static String answer = "";

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// An integer indicating the total number of customers
		int totalCustomers = scan.nextInt();
		
		// Cycles through each customer 
		for (int i = 0; i < totalCustomers; i++) {
			
			double totalCost = 0;
			
			// Gets the first and last name
			String firstName = scan.next();
			String lastName  = scan.next();
			
			// Appends the number of items to the name 
			int items = scan.nextInt();
			
			// Cycles through depending on number of items
			for (int numOfItems = 0; numOfItems < items; numOfItems++) {
				int theNumOfItems = scan.nextInt();
				
				String nameOfItem = scan.next();
				double theCostOfItem = scan.nextDouble();
				totalCost += theNumOfItems * theCostOfItem; 
			}
			print(firstName, lastName, totalCost);
		}
		// Prints out the names along with their total cost
		System.out.println(answer);
		// Closes scanner 
		scan.close();
	}
	/* totalCost 
	 * Finds the total cost of a customers cart
	 *
	 * Input: Number of each type of food
	 * 
	 * Output: Double value of the total cost
	 * 
	 * Preconditions: Must provide 3 input values which are integers
	 */
	static void print(String firstName, String lastName, double totalCost) {
		answer += "\n" + customerName(firstName, lastName) + ":" + String.format(java.util.Locale.US,"%.2f", totalCost);
	}
	/* customerName 
	 * Prints the customers name with the first name 
	 * represented with one initial 
	 *
	 * Input: First and Last name
	 * 
	 * Output: First initial with last name
	 * 
	 * Preconditions: Must provide the first name and last name 
	 */
	static String customerName(String firstName, String lastName) {
		return String.valueOf(firstName.charAt(0)).toUpperCase() + ". " + lastName;
	}
}






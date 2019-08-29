package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static ArrayList<String> food = new ArrayList<>();
	public static ArrayList<Integer> customerItems   = new ArrayList<>();
	public static String[] foodInfo;
	public static int[] customerInfo;
	public static int[] totalFoodInfo;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// An integer indicating the total number of items
		int total_Items = scan.nextInt();
		
		// Cycles through each item 
		for (int i = 0; i < total_Items; i++) {
			String nameOfItem = scan.next();
			double itemCost   = scan.nextDouble();
			// Adds the item to a array list to be called later
			food.add(nameOfItem);
		}
		foodInfo = new String[food.size()];
		customerInfo = new int[food.size()];
		totalFoodInfo = new int[food.size()];
		
		// Copies food list into the first column
		for (int i = 0; i < foodInfo.length; i++) {
			foodInfo[i] = food.get(i);
		}
		// Puts all 0's in customerInfo
		for (int i = 0; i < customerInfo.length; i++) {
			customerInfo[i] = 0;
		}
		
		// An integer indicating the number of customers
		int total_Customers = scan.nextInt();
		for (int i = 0; i < total_Customers; i++) {
			String allTheFood = "";
			// Gets the first and last name
			String firstName = scan.next();
			String lastName  = scan.next();
			// Gets the number of items that customer has
			int items = scan.nextInt();
			// Loops through the number of items
			for (int j = 0; j < items; j++) {
				int howMany = scan.nextInt();
				String theFood = scan.next();
				for (int k = 0; k < foodInfo.length; k++) {
					if (theFood.contentEquals(foodInfo[k])) {
						totalFoodInfo[k] += howMany;
					}
					if (theFood.contentEquals(foodInfo[k]) && !(allTheFood.contains(theFood))) {
						customerInfo[k] += 1;
					}
				}
				allTheFood += theFood + " ";
			}
		}
		// Prints out all the necessary output
		System.out.println();
		for (int i = 0; i < foodInfo.length; i++) {
			if (customerInfo[i] == 0) {
				System.out.println("No customers bought " + foodInfo[i]);
			} else {
				System.out.println(customerInfo[i] + " customers bought " + totalFoodInfo[i] + " " + foodInfo[i]);
			}
		}
		scan.close();
	}
}



















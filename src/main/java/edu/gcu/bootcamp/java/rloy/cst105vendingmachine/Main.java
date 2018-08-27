package edu.gcu.bootcamp.java.rloy.cst105vendingmachine;

public class Main {
	
	// Class attribute fields
	private static double wallet = 5.00;
	
	// Class Getters / Setters
	
	// Class constructors
	
	// Class user-defined methods / behaviors
	
	public static double payMachine (double d) {
		wallet = wallet - d;
		return wallet;
	}

	// Starting point for the Vending Machine project
	public static void main(String[] args) {
		
		// Create new objects
		// Creating a new object requires information to be 
		// sent to the Inventory constructor
		Inventory item1 = new Inventory(1, "M&M", 0.75, 10);
		Inventory item2 = new Inventory(2, "Milky Way", 0.65, 12);
		Inventory item3 = new Inventory(3, "Funions", 1.25, 3);	
		
		// Run my tests / behaviors
		System.out.println(item1.displayContent());
		System.out.println("Current Wallet balance : " + wallet);
		payMachine(item1.dispenseProduct(0.75));
		System.out.println("Current Wallet balance : " + wallet);	
		System.out.println(item1.displayContent());
	}

}

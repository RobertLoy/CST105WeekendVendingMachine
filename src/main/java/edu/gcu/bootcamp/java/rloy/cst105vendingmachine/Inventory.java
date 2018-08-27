package edu.gcu.bootcamp.java.rloy.cst105vendingmachine;

public class Inventory {
	
	// Class attributes / fields
	private int id;
	private String product;
	private double price;
	private int quantity;
	
	// Class Getters/ Setters
	public void setId(int i) {
		this.id = i;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setProduct(String p) {
		this.product = p;
	}
	
	public String getProduct() {
		return this.product;
	}

	public void setPrice(double p) {
		this.price = p;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public int getQuantity() {
		return this.quantity;
	}	
	
	// Class constructors
	public Inventory(int i, String p, double c, int q) {
		this.setId(i);
		this.setProduct(p);
		this.setPrice(c);		
		this.setQuantity(q);
	}
	
	// Class user-defined methods / behaviors
	public double dispenseProduct(double d ) {
		this.quantity--;
		return  this.getPrice();
	}

	public String displayContent() {
		String content = "\nProduct : " + this.product + "; Quantity : " + this.quantity;
		return content;
	}
}

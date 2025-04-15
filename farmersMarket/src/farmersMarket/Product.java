package farmersMarket;

import java.util.ArrayList;

public class Product {
   
	//make protected since other classes will inherit
	protected String name;
	protected double price;
	protected int stock; 
	protected int totalSold = 0;
	protected ArrayList<Integer> reviews = new ArrayList<>();
	
	//constructor 
	public Product(String name, double price, int stock) {
		this.name = name; 
		this.price = price; 
		this.stock = stock;
	}
	
	//sell method 
	public void sell(int quantity) {
		if (quantity <= stock) { 
			stock -= quantity; 
			totalSold += quantity;
		}
	}
	
	//re-stock method 
	public void restock(int quantity) { 
		stock += quantity;
	}
	
	//add review method
	public void addReview(int rating) { 
		if (rating >=1 && rating <=5) { 
			reviews.add(rating);
		}
	}
	
	//see average rating method 
	public double getAverageRating() { 
		if (reviews.isEmpty()) return 0; 
		
		int sum = 0; 
		for (int rating : reviews) { 
			sum += rating;
		}
		
		return (double) sum / reviews.size();
	}
	
	//generate getters and setters 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}

	//print product name and price which can be overridden by inherited classes
	public void printProductInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: $" + String.format("%.2f", price));
		
	}
	
}

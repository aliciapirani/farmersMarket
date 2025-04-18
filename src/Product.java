import java.util.ArrayList;
import java.util.HashSet;

public class Product {
   
	//make protected since other classes will inherit
	protected String name;
	protected double price;
	protected int stock; 
	protected int totalSold = 0;
	protected ArrayList<Integer> reviews = new ArrayList<>();
	protected HashSet<String> reviewers = new HashSet<>(); //prevent duplicate customer reviews. limits each customer to review each product once. 

	
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
//	public void addReview(int rating) { 
//		if (rating >=1 && rating <=5) { 
//			reviews.add(rating);
//		}
//	}
	
	//add review method with hashset to prevent duplicates using customer name
	public void addReview(Customer customer, int rating) {
	    if (rating >= 1 && rating <= 5 && !reviewers.contains(customer.getName())) {  // Check HashSet
	        reviews.add(rating);
	        reviewers.add(customer.getName());  //add customer name to prevent duplicate review
	        System.out.println("Thank you for leaving a review for " + this.name + "!");
	    } else {
	        System.out.println("You have already reviewed this product or the rating is invalid.");
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

	//print product name, price, stock quantity which can be overridden by inherited classes
	public String toString() {
		String outputString = "Name: " + name + "\n" + "Price: $" + String.format("%.2f", price) + "\n" + "Quantity In Stock: " + stock + "\n";
		return outputString;
		
	}
	
}

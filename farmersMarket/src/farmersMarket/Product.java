package farmersMarket;

public class Product {
   
	//make protected since other classes will inherit
	protected String name;
	protected String description;
	protected double price;
	
	//generate getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		
	//print product name, description, and price which can be overridden by inherited classes
	public void printProductInfo() {
		System.out.println("Name: " + name);
		System.out.println("Description: " + description); 
		System.out.println("Price: $" + price);

		
	}
	
}

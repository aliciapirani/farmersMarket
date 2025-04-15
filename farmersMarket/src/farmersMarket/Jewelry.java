package farmersMarket;

public class Jewelry extends Product {
   
	private String material;
	
	//constructor 
	public Jewelry(String name, double price, int stock, String material) { 
		super(name, price, stock); 
		this.material = material;
	}
	
	//generate getters and setters 
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	//print method from product that has been overridden based on jewelry class
	@Override
	public void printProductInfo() { 
		super.printProductInfo();
		System.out.println("Material piece is made out of: " + material);
	}

		
}

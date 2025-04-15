package farmersMarket;

public class Produce extends Product {
    
	boolean isOrganic;
	
	//constructor 
	public Produce(String name, double price, int stock, boolean isOrganic) { 
		super(name, price, stock); 
		this.isOrganic = isOrganic;
	}

	//generate getters and setters
	public boolean isOrganic() {
		return isOrganic;
	}

	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	//print method from product that has been overridden based on produce class
	@Override
	public void printProductInfo() { 
		super.printProductInfo();
		if (isOrganic) { 
			System.out.println("This product is organic.");
		} else if (!isOrganic) { 
			System.out.println("This product is not organic.");
		}
	}
	
}

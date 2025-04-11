package farmersMarket;

public class Plant extends Product {
    
	private String flowerColor;
	private double inchesWaterNeeded; 
	private int hoursSunlightNeeded;
	
	//generate getters and setters
	public String getFlowerColor() {
		return flowerColor;
	}

	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}

	public double getInchesWaterNeeded() {
		return inchesWaterNeeded;
	}

	public void setInchesWaterNeeded(double inchesWaterNeeded) {
		this.inchesWaterNeeded = inchesWaterNeeded;
	}

	public int getHoursSunlightNeeded() {
		return hoursSunlightNeeded;
	}

	public void setHoursSunlightNeeded(int hoursSunlightNeeded) {
		this.hoursSunlightNeeded = hoursSunlightNeeded;
	}
	
	
	//print method from product that has been overridden based on plant class
	@Override
	public void printProductInfo() { 
		super.printProductInfo();
		System.out.println("Flower Color: " + flowerColor);
		System.out.println("Inches of water needed per day: " + inchesWaterNeeded +" inches");
		System.out.println("Hours of sunlight needed per day: " + hoursSunlightNeeded);
	}

}

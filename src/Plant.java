public class Plant extends Product {
    
	private String flowerColor;
	private double inchesWaterNeeded; 
	private int hoursSunlightNeeded;
	
	//constructor 
	public Plant(String name, double price, int stock, String flowerColor, double inchesWaterNeeded, int hoursSunlightNeeded) { 
		super(name, price, stock);
		this.flowerColor = flowerColor; 
		this.inchesWaterNeeded = inchesWaterNeeded; 
		this.hoursSunlightNeeded = hoursSunlightNeeded;
	}
	
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
	public String toString() { 
		String outputString = "";
		outputString += super.toString();
		outputString += "Flower Color: " + flowerColor + "\n" + "Inches of water needed per day: " + inchesWaterNeeded +" inches" + "\n" + "Hours of sunlight needed per day: " + hoursSunlightNeeded + " hours" + "\n";
		return outputString;
		
	}

}
